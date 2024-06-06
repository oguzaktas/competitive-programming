class Solution {
    public int findNumberOfLIS(int[] nums) {
        int result = 0, temp = 1;
        int[][] dp = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = dp[i][1] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j][0] + 1 == dp[i][0]) {
                        dp[i][1] += dp[j][1];
                    } else if (dp[j][0] + 1 > dp[i][0]) {
                        temp = Math.max(temp, dp[j][0] + 1);
                        dp[i][0] = dp[j][0] + 1;
                        dp[i][1] = dp[j][1];
                    }
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (dp[i][0] == temp) {
                result += dp[i][1];
            }
        }
        return result;
    }
}

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/563/week-5-october-29th-october-31st/3513/