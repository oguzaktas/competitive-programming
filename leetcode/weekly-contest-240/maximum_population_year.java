class Solution {
    public int maximumPopulation(int[][] logs) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int year = Integer.MAX_VALUE;
        for (int[] log : logs) {
            while (log[1] > log[0]) {
                map.put(log[0], map.getOrDefault(log[0], 0) + 1);
                if (map.get(log[0]) == max) {
                    year = Math.min(year, log[0]);
                } else if (map.get(log[0]) > max) {
                    max = Math.max(max, map.get(log[0]));
                    year = log[0];
                }
                log[0]++;
            }
        }
        return year;
    }
}

// https://leetcode.com/contest/weekly-contest-240/problems/maximum-population-year/