class Solution {
    int count = 0;
    
    public int numberOfArithmeticSlices(int[] A) {
        dfs(A, A.length - 1);
        return count;
    }
    
    public int dfs(int[] A, int i) {
        if (i < 2) {
            return 0;
        }
        int res = 0;
        if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
            res = 1 + dfs(A, i - 1);
            count += res;
        } else {
            dfs(A, i - 1);
        }
        return res;
    }
}

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/586/week-3-february-15th-february-21st/3644/
