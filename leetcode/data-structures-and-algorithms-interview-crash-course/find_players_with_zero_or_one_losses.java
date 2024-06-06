class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> answer1 = new ArrayList<>(), answer2 = new ArrayList<>();
        int[] arr = new int[100001];
        int max = -1, w = 0, l = 0;
        for (int[] match : matches) {
            w = match[0];
            l = match[1];
            arr[l] += 2;
            if (arr[w] == 0) {
                arr[w] = -1;
            }
            max = Math.max(max, Math.max(w, l));
        }
        int i = 0;
        while (i <= max) {
            while (i < max && arr[i] == 0) {
                i++;
            }
            if (arr[i] == -1) {
                answer1.add(i);
            } else if (arr[i] == 1 || arr[i] == 2) {
                answer2.add(i);
            }
            i++;
        }
        result.add(answer1);
        result.add(answer2);
        return result;
        /*
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int[] match : matches) {
            map.put(match[1], map.getOrDefault(match[1], 0) + 1);
            if (!map.containsKey(match[0])) {
                map.put(match[0], 0);
            }
        }
        List<Integer> answer1 = map.keySet().stream().filter(k -> map.get(k).equals(0)).collect(Collectors.toList());
        Collections.sort(answer1);
        List<Integer> answer2 = map.keySet().stream().filter(k -> map.get(k).equals(1)).collect(Collectors.toList());
        Collections.sort(answer2);
        result.add(answer1);
        result.add(answer2);
        return result;
        */
    }
}

// https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4606/