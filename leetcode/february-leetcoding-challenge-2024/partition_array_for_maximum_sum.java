class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return maxSum(arr, k, dp, 0);
    }

    public int maxSum(int[] arr, int k, int[] dp, int start) {
        if (start >= arr.length) {
            return 0;
        }
        if (dp[start] != -1) {
            return dp[start];
        }
        int currentMax = 0, answer = 0;
        int end = Math.min(arr.length, start + k);
        for (int i = start; i < end; i++) {
            currentMax = Math.max(currentMax, arr[i]);
            answer = Math.max(answer, currentMax * (i - start + 1) + maxSum(arr, k, dp, i + 1));
        }
        return dp[start] = answer;
    }
}

// https://leetcode.com/problems/partition-array-for-maximum-sum/?envType=daily-question&envId=2024-02-03