class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != 0 && target <= matrix[i][matrix[i].length - 1]) {
                int first = 0;
                int last = matrix[i].length - 1;
                int middle;
                while (first <= last) {
                    middle = (first + last) / 2;
                    if (matrix[i][middle] < target) {
                        first = middle + 1;
                    } else if (matrix[i][middle] > target) {
                        last = middle - 1;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

// https://leetcode.com/problems/search-a-2d-matrix/