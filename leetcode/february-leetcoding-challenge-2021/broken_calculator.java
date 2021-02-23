class Solution {
    public int brokenCalc(int X, int Y) {
        if (X == Y) {
            return 0;
        }
        if (X > Y) {
            return X - Y;
        }
        int result = 0;
        while (Y > X) {
            result++;
            if (Y % 2 == 1) {
                Y++;
            } else {
                Y /= 2;
            }
        }
        return result + X - Y;
    }
}

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/586/week-3-february-15th-february-21st/3647/