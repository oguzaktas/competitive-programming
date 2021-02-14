class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            int currentFreq = map.getOrDefault(i, 0);
            map.put(i, currentFreq + 1);
        }
        int maxLHS = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int currentKey = entry.getKey();
            int freq = entry.getValue();
            int currentLHS = 0;
            if (map.containsKey(currentKey + 1)) {
                currentLHS = freq + map.get(currentKey + 1);
            }
            maxLHS = Math.max(maxLHS, currentLHS);
        }
        return maxLHS;
    }
}

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/584/week-1-february-1st-february-7th/3628/