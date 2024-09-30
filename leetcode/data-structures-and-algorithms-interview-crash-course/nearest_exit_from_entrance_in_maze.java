class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int startRow = entrance[0], startCol = entrance[1];
        maze[startRow][startCol] = '+';
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startRow, startCol, 0});
        while (!queue.isEmpty()) {
            int[] currentState = queue.poll();
            int currentRow = currentState[0], currentCol = currentState[1], currentDistance = currentState[2];
            for (int[] direction : directions) {
                int nextRow = currentRow + direction[0], nextCol = currentCol + direction[1];
                if (0 <= nextRow && nextRow < maze.length && 0 <= nextCol && nextCol < maze[0].length && maze[nextRow][nextCol] == '.') {
                    if (nextRow == 0 || nextRow == maze.length - 1 || nextCol == 0 || nextCol == maze[0].length - 1) {
                        return currentDistance + 1;
                    }
                    maze[nextRow][nextCol] = '+';
                    queue.offer(new int[]{nextRow, nextCol, currentDistance + 1});
                }
            }
        }
        return -1;
    }
}

// https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/707/traversals-trees-graphs/4632/