class Solution {
    public int snakesAndLadders(int[][] board) {
        int destination = board.length * board.length - 1;
        int count = 0;
        boolean[] visited = new boolean[destination + 1];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(0);
        while (!queue.isEmpty()) {
            for (int i = queue.size(); i > 0; i--) {
                int val = queue.poll();
                if (val == destination) {
                    return count;
                }
                for (int j = 1; j <= 6 && val + j <= destination; j++) {
                    int[] grid = getCoordinates(val + j, board.length);
                    int nextVal = board[grid[0]][grid[1]] == -1 ? val + j : board[grid[0]][grid[1]] - 1;
                    if (!visited[nextVal]) {
                        queue.offer(nextVal);
                    }
                    visited[nextVal] = true;
                }
            }
            count++;
        }
        return -1;
    }

    private int[] getCoordinates(int i, int n) {
        int x = n - 1 - i / n;
        int mod = (n - 1) % 2;
        int y = x % 2 == mod ? i % n : n - 1 - (i % n);
        return new int[]{x, y};
    }
}

// https://leetcode.com/problems/snakes-and-ladders/?envType=daily-question&envId=2025-05-31