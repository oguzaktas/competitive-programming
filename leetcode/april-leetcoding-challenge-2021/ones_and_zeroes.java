class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String s : strs) {
            int[] count = count(s);
            for (int i = m; i >= count[0]; i--) {
                for (int j = n; j >= count[1]; j--) {
                    dp[i][j] = Math.max(1 + dp[i - count[0]][j - count[1]], dp[i][j]);
                }
            }
        }
        return dp[m][n];
    }
    
    public int[] count(String str) {
        int[] result = new int[2];
        for (int i = 0; i < str.length(); i++) {
            result[str.charAt(i) - '0']++;
        }
        return result;
    }
}

// https://leetcode.com/explore/featured/card/april-leetcoding-challenge-2021/593/week-1-april-1st-april-7th/3694/