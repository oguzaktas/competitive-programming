class Solution {
    public int longestPalindromicSubsequence(String s, int k) {
        int n = s.length();
        int[][][] memo = new int[n][n][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                java.util.Arrays.fill(memo[i][j], -1);
            }
        }
        return dfs(s, 0, n - 1, k, memo);
    }

    private int dfs(String s, int i, int j, int rem, int[][][] memo) {
        if (i > j) { // no characters left
            return 0;
        }
        if (i == j) { // single character is a palindrome
            return 1;
        }
        if (memo[i][j][rem] != -1) {
            return memo[i][j][rem];
        }
        // option 1: skip one of the characters
        int res = Math.max(dfs(s, i + 1, j, rem, memo), dfs(s, i, j - 1, rem, memo));

        // calculate the minimum cost to make s[i] and s[j] equal
        int diff = Math.abs(s.charAt(i) - s.charAt(j));
        int cost = Math.min(diff, 26 - diff);
        // option 2: if we can afford to match these two characters, take them both
        if (cost <= rem) {
            res = Math.max(res, 2 + dfs(s, i + 1, j - 1, rem - cost, memo));
        }

        memo[i][j][rem] = res;
        return res;
    }
}

// https://leetcode.com/contest/weekly-contest-439/problems/longest-palindromic-subsequence-after-at-most-k-operations/