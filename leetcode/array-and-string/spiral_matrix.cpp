class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        if (matrix.size() == 0) {
            return {};
        }
        vector<int> result;
        vector<vector<bool>> seen(matrix.size(), vector<bool>(matrix[0].size(), 0));
        int dr[] = {0, 1, 0, -1};
        int dc[] = {1, 0, -1, 0};
        int r = 0, c = 0, di = 0;
        for (int i = 0; i < matrix.size() * matrix[0].size(); i++) {
            result.push_back(matrix[r][c]);
            seen[r][c] = true;
            int cr = r + dr[di];
            int cc = c + dc[di];
            if (0 <= cr && cr < matrix.size() && 0 <= cc && cc < matrix[0].size() && !seen[cr][cc]) {
                r = cr;
                c = cc;
            } else {
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        return result;
    }
};