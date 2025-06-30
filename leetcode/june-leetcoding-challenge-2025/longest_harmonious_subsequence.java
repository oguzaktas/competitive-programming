class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.containsKey(num + 1)) {
                result = Math.max(result, map.get(num) + map.get(num + 1));
            }
            if (map.containsKey(num - 1)) {
                result = Math.max(result, map.get(num) + map.get(num - 1));
            }
        }
        return result;
        /*
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
        */
    }
}

// https://leetcode.com/problems/longest-harmonious-subsequence/?envType=daily-question&envId=2025-06-30