class Solution {
    public String longestPalindrome(String s) {
        if (s == null || "".equals(s)) {
            return s;
        }
        String result = "";
        int max = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                dp[i][j] = j - i > 2 ? dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j) : s.charAt(i) == s.charAt(j);
                if (dp[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    result = s.substring(i, j + 1);
                }
            }
        }
        return result;
    }
}

//

/* Initial solution
class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (isPalindrome(s.substring(i, j + 1)) && s.substring(i, j + 1).length() > result.length()) {
                    if (s.substring(i, j + 1).length() > result.length())
                    result = s.substring(i, j + 1);
                    break;
                }
            }
        }
        return result.length() > 0 ? result : s.charAt(0) + "";
    }
    
    public boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
*/