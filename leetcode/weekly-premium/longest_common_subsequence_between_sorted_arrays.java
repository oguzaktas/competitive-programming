class Solution {
    public List<Integer> longestCommonSubsequence(int[][] arrays) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int[] arr : arrays) {
            for (int i : arr) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                if (map.get(i) == arrays.length) {
                    ans.add(i);
                }
            }
        }
        return ans;
    }
}

// https://leetcode.com/problems/longest-common-subsequence-between-sorted-arrays/