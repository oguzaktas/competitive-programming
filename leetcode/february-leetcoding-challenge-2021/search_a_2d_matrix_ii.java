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

/*
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }
        int col = matrix[0].length - 1;
        int row = 0;
        while (col >= 0 && row <= matrix.length - 1) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                col--;
            } else if (target > matrix[row][col]) {
                row++;
            }
        }
        return false;
    }
}
*/

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/587/week-4-february-22nd-february-28th/3650/