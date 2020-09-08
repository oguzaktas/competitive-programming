class Solution {
    public int balancedStringSplit(String s) {
        int count = 0, result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L')
                count++;
            else
                count--;
            if (count == 0)
                result++;
        }
        return result;
    }
}

// https://leetcode.com/problems/split-a-string-in-balanced-strings/
/* Python3 solution;
def balancedStringSplit(self, s: str) -> int:
    res = cnt = 0         
    for c in s:
        cnt += 1 if c == 'L' else -1            
        if cnt == 0:
            res += 1
    return res
*/