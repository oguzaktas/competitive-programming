class Solution {
    public boolean hasSameDigits(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length() - 2; i++) {
            for (int j = 0; j < s.length() - i - 1; j++) {
                arr[j] = (char) ((arr[j] + arr[j + 1]) % 10);
            }
        }
        return arr[0] == arr[1];
    }
}

// https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/?envType=daily-question&envId=2025-10-23