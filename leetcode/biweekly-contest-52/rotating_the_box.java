class Solution {
    public char[][] rotateTheBox(char[][] box) {
        char[][] result = new char[box[0].length][box.length];
        for (int i = 0; i < box.length; i++) {
            for (int j = box[i].length - 1, k = box[i].length - 1; j >= 0; j--) {
                result[j][box.length - i - 1] = '.';
                if (box[i][j] != '.') {
                    k = box[i][j] == '*' ? j : k;
                    result[k--][box.length - i - 1] = box[i][j];
                }
            }
        }
        return result;
    }
}

// https://leetcode.com/contest/biweekly-contest-52/problems/rotating-the-box/