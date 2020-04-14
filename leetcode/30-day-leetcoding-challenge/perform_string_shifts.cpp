class Solution {
public:
    string stringShift(string s, vector<vector<int>>& shift) {
        int totalShift = 0;
        for (int i = 0; i < shift.size(); i++) {
            int direction = shift[i][0];
            int amount = shift[i][1];
            if (direction == 0) { // left shift
                totalShift -= amount;
            } else { // right shift
                totalShift += amount;
            }
        }
        
        string newFront;
        string newBack;
        if (totalShift < 0) { // left shift
            totalShift = abs(totalShift) % s.size();
            newFront = s.substr(totalShift);
            newBack = s.substr(0, totalShift);
        } else if (totalShift > 0) { // right shift
            totalShift = totalShift % s.size();
            newFront = s.substr(s.size() - totalShift, totalShift);
            newBack = s.substr(0, s.size() - totalShift);
        } else {
            return s;
        }
        return newFront + newBack;
    }
};

// https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3299/

/* Python simple O(len(s) + len(shift)) Solution
class Solution:
    def stringShift(self, s: str, shift: List[List[int]]) -> str:
        move = 0
        for x, y in shift:
            if x == 0:
                move -= y
            else:
                move += y
        move %= len(s)
        return s[-move:] + s[:-move]
*/