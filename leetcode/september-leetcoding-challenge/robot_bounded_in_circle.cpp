class Solution {
public:
    bool isRobotBounded(string instructions) {
        int x = 0, y = 0, i = 0;
        vector<vector<int>> v = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (char& ins : instructions) {
            if (ins == 'L') {
                i = (i + 3) % 4;
            } else if (ins == 'R') {
                i = (i + 1) % 4;
            } else {
                x += v[i][0];
                y += v[i][1];
            }
        }
        return x == 0 && y == 0 || i > 0;
    }
};

// https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/556/week-3-september-15th-september-21st/3463/
/* Python solution;
def isRobotBounded(self, instructions):
    x, y, dx, dy = 0, 0, 0, 1
    for i in instructions:
        if i == 'R': dx, dy = dy, -dx
        if i == 'L': dx, dy = -dy, dx
        if i == 'G': x, y = x + dx, y + dy
    return (x, y) == (0, 0) or (dx, dy) != (0,1)
*/