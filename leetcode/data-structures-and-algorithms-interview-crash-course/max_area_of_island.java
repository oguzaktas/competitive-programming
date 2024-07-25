class Solution {
    int[][] grid;
    boolean[][] seen;
    
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        this.seen = new boolean[grid.length][grid[0].length];
        int answer = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                answer = Math.max(answer, area(i, j));
            }
        }
        return answer;
    }
    
    private int area(int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || seen[row][col] || grid[row][col] == 0) {
            return 0;
        }
        seen[row][col] = true;
        return (1 + area(row+1, col) + area(row-1, col) + area(row, col-1) + area(row, col+1));
    }
}

// https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/707/traversals-trees-graphs/4628/