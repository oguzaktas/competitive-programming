class Solution {
    public long coloredCells(int n) {
        // O(n) solution with iterative addition
        if (n == 1) {
            return 1;
        }
        int i = 4, j = 2;
        long count = 1;
        while (j <= n) {
            count += i;
            i += 4;
            j++;
        }
        return count;
        /* O(1) solution with mathematical formula
        return 1 + (long) n * (n - 1) * 2;
        */
    }
}

// https://leetcode.com/problems/count-total-number-of-colored-cells/?envType=daily-question&envId=2025-03-05