class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> result;
        if (numRows == 0) {
            return result;
        }
        vector<int> current = {1}, next;
        result.push_back(current);
        while (numRows > 1) {
            next.push_back(1);
            for (int i = 1; i < current.size(); i++) {
                next.push_back(current[i] + current[i - 1]);
            }
            next.push_back(1);
            current = next;
            next.clear();
            result.push_back(current);
            numRows--;
        }
        return result;
    }
};

/* Python solution;
from math import factorial as f

class Solution:
    def generate(self, numRows):
        C = lambda n, r: f(n) // f(r) // f(n - r)
        return [[C(n, r) for r in range(n + 1)] for n in range(numRows)]
*/