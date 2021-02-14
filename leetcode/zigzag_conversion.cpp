class Solution {
public:
    string convert(string s, int numRows) {
        string result = "";
        if (numRows == 1) {
            return s;
        }
        int step1, step2;
        for (int i = 0; i < numRows; i++) {
            step1 = (numRows - i - 1) * 2;
            step2 = i * 2;
            int pos = i;
            if (pos < s.size()) {
                result += s.at(pos);
            }
            while (true) {
                pos += step1;
                if (pos >= s.size()) {
                    break;
                }
                if (step1) {
                    result += s.at(pos);
                }
                pos += step2;
                if (pos >= s.size()) {
                    break;
                }
                if (step2) {
                    result += s.at(pos);
                }
            }
        }
        return result;
    }
};

// https://leetcode.com/problems/zigzag-conversion/