class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (set.contains(grid[i][j])) {
                    result[0] = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                }
            }
        }
        for (int i = 1; i <= grid.length * grid.length; i++) {
            if (!set.contains(i)) {
                result[1] = i;
            }
        }
        return result;
        /* O(n²) better approach using mathematical formula
        long sum = 0, squaredSum = 0, n = grid.length, total = n * n;
        // calculate actual sum and squared sum from grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
                squaredSum += (long) grid[i][j] * grid[i][j];
            }
        }
        // calculate differences from expected sums
        // expected sum: n(n+1)/2, expected square sum: n(n+1)(2n+1)/6
        long sumDiff = sum - (total * (total + 1)) / 2;
        long squaredDiff = squaredSum - (total * (total + 1) * (2 * total + 1)) / 6;
        // using math if x is repeated and y is missing, sumDiff = x-y, squaredDiff = x²-y²
        int repeat = (int) (squaredDiff / sumDiff + sumDiff) / 2;
        int missing = (int) (squaredDiff / sumDiff - sumDiff) / 2;
        return new int[]{repeat, missing};
        */
    }
}

// https://leetcode.com/problems/find-missing-and-repeated-values/?envType=daily-question&envId=2025-03-06