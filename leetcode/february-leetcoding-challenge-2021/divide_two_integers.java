class Solution {
    public int divide(int dividend, int divisor) {
        /*
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        Math.abs(dividend);
        Math.abs(divisor);
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        return sign * quotient;
        */
        if (dividend == 1 << 31 && divisor == -1) {
            return (1 << 31) - 1;
        }
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int res = 0, x = 0;
        while (a - b >= 0) {
            for (x = 0; a - (b << x << 1) >= 0; x++);
            res += 1 << x;
            a -= b << x;
        }
        return (dividend > 0) == (divisor > 0) ? res : -res;
    }
}

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/587/week-4-february-22nd-february-28th/3654/