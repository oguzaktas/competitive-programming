class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int currentRowNegativeIndex = grid[0].length - 1;
        for (int[] row : grid) {
            while (currentRowNegativeIndex >= 0 && row[currentRowNegativeIndex] < 0) {
                currentRowNegativeIndex--;
            }
            count += (grid[0].length - (currentRowNegativeIndex + 1));
        }
        return count;
    }
}

// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/?envType=daily-question&envId=2025-12-28