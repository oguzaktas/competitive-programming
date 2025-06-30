class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[][] arr = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = i;
            arr[i][1] = nums[i];
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));
        Arrays.sort(arr, 0, k, (a, b) -> Integer.compare(a[0], b[0]));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i][1];
        }
        return result;
    }
}

// https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/?envType=daily-question&envId=2025-06-28