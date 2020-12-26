class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        int max = nums[0];
        int index = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            if (i == index) {
                continue;
            } else {
                if (max < nums[i] * 2) {
                    return -1;
                }
            }
        }
        return index;
    }
};

/* Python solution;
class Solution(object):
    def dominantIndex(self, nums):
        m = max(nums)
        if all(m >= 2*x for x in nums if x != m):
            return nums.index(m)
        return -1
*/