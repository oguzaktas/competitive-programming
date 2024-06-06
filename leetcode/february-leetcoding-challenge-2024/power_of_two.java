class Solution {
    public boolean isPowerOfTwo(int n) {
        return n < 1 ? false : (n & (n-1)) == 0 ? true : false;
    }
}

// https://leetcode.com/problems/power-of-two/?envType=daily-question&envId=2024-02-19