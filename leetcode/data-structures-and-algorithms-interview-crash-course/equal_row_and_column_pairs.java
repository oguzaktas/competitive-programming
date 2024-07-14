class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        Map<String, Integer> rowCounter = new HashMap<>();
        for (int[] row : grid) {
            String rowString = Arrays.toString(row);
            rowCounter.put(rowString, rowCounter.getOrDefault(rowString, 0) + 1);
        }
        for (int c = 0; c < grid.length; c++) {
            int[] colArray = new int[grid.length];
            for (int r = 0; r < grid.length; r++) {
                colArray[r] = grid[r][c];
            }
            count += rowCounter.getOrDefault(Arrays.toString(colArray), 0);
        }
        return count;
    }
}

// https://leetcode.com/problems/equal-row-and-column-pairs/