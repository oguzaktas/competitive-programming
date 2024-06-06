class Solution {
    fun gameOfLife(board: Array<IntArray>): Unit {
        val result = Array(board.size){ IntArray(board[0].size) }
        for (i in board.indices) {
            for (j in board[i].indices) {
                val temp = IntArray(8)
                runCatching { board[i - 1][j - 1] }.onSuccess { temp[0] = it }.onFailure { temp[0] = -1 }
                runCatching { board[i - 1][j] }.onSuccess { temp[1] = it }.onFailure { temp[1] = -1 }
                runCatching { board[i - 1][j + 1] }.onSuccess { temp[2] = it }.onFailure { temp[2] = -1 }
                runCatching { board[i][j - 1] }.onSuccess { temp[3] = it }.onFailure { temp[3] = -1 }
                runCatching { board[i][j + 1] }.onSuccess { temp[4] = it }.onFailure { temp[4] = -1 }
                runCatching { board[i + 1][j - 1] }.onSuccess { temp[5] = it }.onFailure { temp[5] = -1 }
                runCatching { board[i + 1][j] }.onSuccess { temp[6] = it }.onFailure { temp[6] = -1 }
                runCatching { board[i + 1][j + 1] }.onSuccess { temp[7] = it }.onFailure { temp[7] = -1 }
                when (board[i][j]) {
                    0 -> if (temp.count { it == 1 } == 3) {
                        result[i][j] = 1
                    }
                    1 -> if (temp.count { it == 1 } !in 2..3) {
                        result[i][j] = 0
                    }
                    else result[i][j] = 1
                }
            }
        }
        result.forEachIndexed { index, ints -> board[index] = ints }
    }
}

// https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/573/week-5-december-29th-december-31st/3586/

/*
class Solution {
    public void gameOfLife(int[][] board) {
        int[][] temp = new int[board.length][board[0].length];
        int[][] directions = new int[][]{
            {-1, -1},
            {-1, 0},
            {-1, 1},
            {0, -1},
            {0, 1},
            {1, -1},
            {1, 0},
            {1, 1}
        };
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int liveCells = 0;
                for (int[] dir : directions) {
                    int x = dir[0] + i;
                    int y = dir[1] + j;
                    if (x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == 1) {
                        liveCells++;
                    }
                }
                if (board[i][j] == 0 && liveCells == 3) {
                    temp[i][j] = 1;
                } else if (board[i][j] == 1 && (liveCells == 2 || liveCells == 3)) {
                    temp[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = temp[i][j];
            }
        }
    }
}
*/