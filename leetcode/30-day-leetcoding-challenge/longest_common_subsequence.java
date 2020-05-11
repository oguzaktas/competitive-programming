// https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/531/week-4/3311/

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() == 0 || text2.length() == 0) {
            return 0;
        }
        char[] s1 = text1.toCharArray();
        char[] s2 = text2.toCharArray();
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = text1.length() - 1; i >= 0; i--) {
            for (int j = text2.length() - 1; j >= 0; j--) {
                int max = Math.max(dp[i + 1][j], dp[i][j + 1]);
                if (s1[i] == s2[j]) {
                    max = Math.max(max, dp[i + 1][j + 1] + 1);
                }
                dp[i][j] = max;
            }
        }
        return dp[0][0];
    }
}