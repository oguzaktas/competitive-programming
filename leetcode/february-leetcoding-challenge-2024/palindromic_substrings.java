class Solution {
    public int countSubstrings(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                result += isPalindrome(s, i, j) ? 1 : 0;
            }
        }
        return result;
    }

    public boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

// https://leetcode.com/problems/palindromic-substrings/?envType=daily-question&envId=2024-02-10