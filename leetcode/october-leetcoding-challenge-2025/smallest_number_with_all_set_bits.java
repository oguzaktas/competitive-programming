class Solution {
    public int smallestNumber(int n) {
        return (int) Math.pow(2, (int) (Math.log(n) / Math.log(2)) + 1) - 1;
    }
}

// https://leetcode.com/problems/smallest-number-with-all-set-bits/?envType=daily-question&envId=2025-10-29