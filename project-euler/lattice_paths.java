class LatticePaths {
    public static void main(String[] args) {
        System.out.println(findRoutes());
    }

    public static long findRoutes() {
        long[][] grid = new long[21][21];
        for (int i = 0; i < 20; i++) {
            grid[i][20] = 1;
            grid[20][i] = 1;
        }
        for (int i = 19; i >= 0; i--) {
            for (int j = 19; j >= 0; j--) {
                grid[i][j] = grid[i + 1][j] + grid[i][j + 1];
            }
        }
        return grid[0][0];
    }
}

// https://www.mathblog.dk/project-euler-15/