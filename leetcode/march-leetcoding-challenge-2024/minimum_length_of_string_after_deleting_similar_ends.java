class Solution {
    public int minimumLength(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int right = 0, left = s.length()-1;
        while (right < left && s.charAt(right) == s.charAt(left)) {
            char c = s.charAt(right);
            while (right <= left && s.charAt(right) == c) {
                right++;
            }
            while (left > right && s.charAt(left) == c) {
                left--;
            }
        }
        return left-right+1;
    }
}

// https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/?envType=daily-question&envId=2024-03-05