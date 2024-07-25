class Solution {
    class Pair {
        int x, y, count;
        Pair(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        return bfs(grid, 0, 0, grid.length - 1, grid[0].length - 1);
    }

    private int bfs(int[][] grid, int startx, int starty, int targetx, int targety) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(startx, starty, 1));
        while (queue.size() > 0) {
            Pair pair = queue.remove();
            int x = pair.x, y = pair.y, count = pair.count;
            if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] != 1) {
                grid[x][y] = 1;
                if (x == targetx && y == targety) {
                    return count;
                }
                queue.add(new Pair(x - 1, y, count + 1));
                queue.add(new Pair(x - 1, y + 1, count + 1));
                queue.add(new Pair(x, y + 1, count + 1));
                queue.add(new Pair(x + 1, y + 1, count + 1));
                queue.add(new Pair(x + 1, y, count + 1));
                queue.add(new Pair(x + 1, y - 1, count + 1));
                queue.add(new Pair(x, y - 1, count + 1));
                queue.add(new Pair(x - 1, y - 1, count + 1));
            }
        }
        return -1;
    }
}

// https://leetcode.com/problems/shortest-path-in-binary-matrix/