class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] cups = new double[100][100];
        cups[0][0] = (double) poured;
        if (poured == 0) {
            return 0;
        }
        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                double q = (cups[i][j] - 1.0) / 2.0;
                if (q > 0) {
                    cups[i + 1][j] += q;
                    cups[i + 1][j + 1] += q;
                }
            }
        }
        return Math.min(1, cups[query_row][query_glass]);
    }
}

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/562/week-4-october-22nd-october-28th/3508/

// https://massivealgorithms.blogspot.com/2018/04/leetcode-799-champagne-tower.html

/* Python DP solution;
class Solution:
    def champagneTower(self, poured: int, query_row: int, query_glass: int) -> float:
        dp = [[0 for i in range(query_glass+1)] for _ in range(query_row+1)]
        for i in range(query_row+1):
            for j in range(query_glass+1):
                if j > i:
                    continue
                if i == j == 0:
                    dp[i][j] = poured
                    continue
                dp[i][j] = max((dp[i-1][j] - 1) / 2, 0)
                if j > 0:
                    dp[i][j] += max((dp[i-1][j-1] - 1) / 2, 0)
        return min(dp[query_row][query_glass], 1)
*/