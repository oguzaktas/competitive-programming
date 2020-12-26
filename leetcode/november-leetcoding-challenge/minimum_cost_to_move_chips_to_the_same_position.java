class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for (int p : position) {
            if (p % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(even, odd);
    }
}

// https://leetcode.com/explore/challenge/card/november-leetcoding-challenge/564/week-1-november-1st-november-7th/3520/

/* Python solution (same approach) - Time complexity: O(n), space complexity: O(1);
class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for (int p : position) {
            if (p % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(even, odd);
    }
}
*/