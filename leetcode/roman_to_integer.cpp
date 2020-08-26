class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char, int> numerals = {{'I', 1}, {'V', 5}, {'X', 10}, {'L', 50},
                                             {'C', 100}, {'D', 500}, {'M', 1000}};
        int sum = numerals[s.back()];
        for (int i = s.length() - 2; i >= 0; i--) {
            if (numerals[s[i]] < numerals[s[i+1]])
                sum -= numerals[s[i]];
            else
                sum += numerals[s[i]];
        }
        return sum;
    }
};

// https://leetcode.com/problems/roman-to-integer/
/* Python solution;
class Solution:
# @param {string} s
# @return {integer}
def romanToInt(self, s):
    roman = {'M': 1000,'D': 500 ,'C': 100,'L': 50,'X': 10,'V': 5,'I': 1}
    z = 0
    for i in range(0, len(s) - 1):
        if roman[s[i]] < roman[s[i+1]]:
            z -= roman[s[i]]
        else:
            z += roman[s[i]]
    return z + roman[s[-1]]
*/