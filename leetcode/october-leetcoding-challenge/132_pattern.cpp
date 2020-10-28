class Solution {
public:
    bool find132pattern(vector<int>& nums) {
        vector<int> minVals(nums.size());
        minVals[0] = nums[0];
        for (int i = 1; i < nums.size(); i++) {
            minVals[i] = min(minVals[i - 1], nums[i]);
        }
        stack<int> s;
        for (int i = nums.size() - 1; i > 0; i--) {
            int minVal = minVals[i - 1];
            int curr = nums[i];
            while (!s.empty() && s.top() <= minVal) {
                s.pop();
            }
            if (!s.empty() && s.top() < curr) {
                return true;
            }
            s.push(nums[i]);
        }
        return false;
    }
};

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/562/week-4-october-22nd-october-28th/3505/

// https://www.tutorialspoint.com/132-pattern-in-cplusplus

/* O(n^3) Java brute force solution;
public class Solution {
    public boolean find132pattern(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] > nums[i] && nums[j] > nums[k])
                        return true;
                }
            }
        }
        return false;
    }
}
*/

// https://leetcode.com/problems/132-pattern/solution/