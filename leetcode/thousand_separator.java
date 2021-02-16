class Solution {
    public String thousandSeparator(int n) {
        if (n < 1000) {
            return String.valueOf(n);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i, '.');
        }
        return sb.toString();
    }
}

// https://leetcode.com/problems/thousand-separator/