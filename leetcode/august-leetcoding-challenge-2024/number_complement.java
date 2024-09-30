class Solution {
    public int findComplement(int num) {
        int bit = 1, todo = num;
        while (todo != 0) {
            num = num ^ bit;
            bit = bit << 1;
            todo = todo >> 1;
        }
        return num;
        /*
        if (num == 0) {
            return 1;
        }
        int bitLength = Integer.toBinaryString(num).length();
        int mask = (1 << bitLength) - 1;
        return num ^ mask;
        */
    }
}

// https://leetcode.com/problems/number-complement/?envType=daily-question&envId=2024-08-22