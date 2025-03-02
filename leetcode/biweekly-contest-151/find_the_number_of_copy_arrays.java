class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        long lower = Long.MIN_VALUE;
        long upper = Long.MAX_VALUE;
        long base = original[0];
        
        for (int i = 0; i < original.length; i++) {
            long offset = original[i] - base;
            long currentLower = bounds[i][0] - offset;
            long currentUpper = bounds[i][1] - offset;
            lower = Math.max(lower, currentLower);
            upper = Math.min(upper, currentUpper);
        }
        
        if (upper < lower) {
            return 0;
        }
        
        return (int)(upper - lower + 1);
    }
}

// https://leetcode.com/contest/biweekly-contest-151/problems/find-the-number-of-copy-arrays/