class Solution {
    public String firstPalindrome(String[] words) {
        for (String s : words) {
            if (s.length() == 1) {
                return s;
            }
            int i = 0, j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    break;
                }
                i++;
                j--;
                if (i >= j) {
                    return s;
                }
            }
        }
        return "";
        /*
        for (String s : words) {
            String reversed = new StringBuilder(s).reverse().toString();
            if (s.equals(reversed)) {
                return s;
            }
        }
        return "";
        */
    }
}

// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/?envType=daily-question&envId=2024-02-13