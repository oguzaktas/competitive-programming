class Solution {
    public int maxSum(int[] nums, int k, int m) {
        int n = nums.length;
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
            for (int j = 1; j <= k; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
        
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }
        
        for (int j = 1; j <= k; j++) {
            int best = Integer.MIN_VALUE;
            for (int i = j * m; i <= n; i++) {
                best = Math.max(best, dp[i - m][j - 1] - prefix[i - m]);
                dp[i][j] = Math.max(dp[i - 1][j], prefix[i] + best);
            }
        }
        return dp[n][k];
    }
}

// https://leetcode.com/contest/weekly-contest-439/problems/sum-of-k-subarrays-with-length-at-least-m/