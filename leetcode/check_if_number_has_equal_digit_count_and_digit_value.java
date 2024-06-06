class Solution {
    public boolean digitCount(String num) {
        for (int i = 0; i < num.length(); i++) {
            char current = Character.forDigit(i, 10);
            int count = (int) num.codePoints().filter(ch -> ch == current).count();
            if (Character.getNumericValue(num.charAt(i)) != count) {
                return false;
            }
        }
        return true;
    }
}

// https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/