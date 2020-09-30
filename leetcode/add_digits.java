class Solution {
    public int addDigits(int num) {
        int temp = num;
        while (true) {
            int result = 0;
            while (temp != 0) {
                result += temp % 10;
                temp /= 10;
            }
            if (result < 10) {
                return result;
            } else {
                temp = result;
            }
        }
    }
}

// https://leetcode.com/problems/add-digits/