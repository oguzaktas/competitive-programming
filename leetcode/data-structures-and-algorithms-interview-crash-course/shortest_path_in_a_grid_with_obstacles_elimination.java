class State {
    int row, col, remain, steps;
    State(int row, int col, int remain, int steps) {
        this.row = row;
        this.col = col;
        this.remain = remain;
        this.steps = steps;
    }
}

class Solution {
    int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int shortestPath(int[][] grid, int k) {
        Queue<State> queue = new LinkedList<>();
        boolean[][][] seen = new boolean[grid.length][grid[0].length][k + 1];
        queue.add(new State(0, 0, k, 0));
        seen[0][0][k] = true;
        while (!queue.isEmpty()) {
            State state = queue.remove();
            int row = state.row, col = state.col, remain = state.remain, steps = state.steps;
            if (row == grid.length - 1 && col == grid[0].length - 1) {
                return steps;
            }
            for (int[] direction : directions) {
                int nextRow = row + direction[0], nextCol = col + direction[1];
                if (0 <= nextRow && nextRow < grid.length && 0 <= nextCol && nextCol < grid[0].length) {
                    if (grid[nextRow][nextCol] == 0) {
                        if (!seen[nextRow][nextCol][remain]) {
                            seen[nextRow][nextCol][remain] = true;
                            queue.add(new State(nextRow, nextCol, remain, steps + 1));
                        }
                    } else if (remain > 0 && !seen[nextRow][nextCol][remain - 1]) {
                        seen[nextRow][nextCol][remain - 1] = true;
                        queue.add(new State(nextRow, nextCol, remain - 1, steps + 1));
                    }
                }
            }
        }
        return - 1;
    }
}

// https://leetcode.com/problems/shortest-path-in-a-grid-with-obstacles-elimination/