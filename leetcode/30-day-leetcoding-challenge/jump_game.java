// https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3310/

class Solution {
    public boolean canJump(int[] nums) {
        int pos = 0;
        int n = nums.length;
        int step = nums[0];
        while (pos < n  && step > 0){
            step = nums[pos];
            for (int i = 1; i <= step && pos + i < n; i++){
                if (i + nums[pos + i] > step){
                    step = i;
                    break;
                }
            }
            pos += step;
        }
        return pos >= n - 1;
    }
}

/* 1 line C++ recursion;
class Solution {
public:
    bool canJump(vector<int>& nums, int begin=0, int last=0) {
        return last>=nums.size()-1? true: (begin>last? false: canJump(nums,begin+1,max(last,begin+nums[begin])));
    }
};
*/