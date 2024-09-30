class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rowBegin = 0, rowEnd = n - 1;
        int columnBegin = 0, columnEnd = n - 1;
        int count = 1;
        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {
            for (int i = columnBegin; i <= columnEnd; i++) {
                matrix[rowBegin][i] = count++;
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd; i++) {
                matrix[i][columnEnd] = count++;
            }
            columnEnd--;
            if (rowBegin <= rowEnd) {
                for (int i = columnEnd; i >= columnBegin; i--) {
                    matrix[rowEnd][i] = count++;
                }
            }
            rowEnd--;
            if (columnBegin <= columnEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    matrix[i][columnBegin] = count++;
                }
            }
            columnBegin++;
        }
        return matrix;
    }
}

// https://leetcode.com/problems/spiral-matrix-ii/