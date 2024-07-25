class State {
    int row, col, steps;
    State(int row, int col, int steps) {
        this.row = row;
        this.col = col;
        this.steps = steps;
    }
}

class Solution {
    int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int[][] updateMatrix(int[][] mat) {
        int[][] matrix = new int[mat.length][mat[0].length];
        boolean[][] seen = new boolean[mat.length][mat[0].length];
        Queue<State> queue = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new State(i, j, 0));
                    seen[i][j] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            State state = queue.remove();
            int row = state.row, col = state.col, steps = state.steps;
            for (int[] direction : directions) {
                int nextRow = row + direction[0], nextCol = col + direction[1];
                if (0 <= nextRow && nextRow < mat.length && 0 <= nextCol && nextCol < mat[0].length && !seen[nextRow][nextCol]) {
                    seen[nextRow][nextCol] = true;
                    queue.add(new State(nextRow, nextCol, steps + 1));
                    matrix[nextRow][nextCol] = steps + 1;
                }
            }
        }
        return matrix;
    }
}

// https://leetcode.com/problems/01-matrix/