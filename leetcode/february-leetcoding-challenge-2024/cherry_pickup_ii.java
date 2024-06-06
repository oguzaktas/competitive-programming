class Solution {
    public int cherryPickup(int[][] grid) {
        int[][][] dpCache = new int[grid.length][grid[0].length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                for (int k = 0; k < grid[0].length; k++) {
                    dpCache[i][j][k] = -1;
                }
            }
        }
        return dp(0, 0, grid[0].length - 1, grid, dpCache);
    }

    public int dp(int row, int col1, int col2, int[][] grid, int[][][] dpCache) {
        if (col1 < 0 || col1 >= grid[0].length || col2 < 0 || col2 >= grid[0].length) {
            return 0;
        }
        if (dpCache[row][col1][col2] != -1) {
            return dpCache[row][col1][col2];
        }
        int result = 0;
        result += grid[row][col1];
        if (col1 != col2) {
            result += grid[row][col2];
        }
        if (row != grid.length - 1) {
            int max = 0;
            for (int newCol1 = col1 - 1; newCol1 <= col1 + 1; newCol1++) {
                for (int newCol2 = col2 - 1; newCol2 <= col2 + 1; newCol2++) {
                    max = Math.max(max, dp(row + 1, newCol1, newCol2, grid, dpCache));
                }
            }
            result += max;
        }
        dpCache[row][col1][col2] = result;
        return result;
    }
}

// https://leetcode.com/problems/cherry-pickup-ii/?envType=daily-question&envId=2024-02-11