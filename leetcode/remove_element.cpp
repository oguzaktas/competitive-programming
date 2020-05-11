// https://leetcode.com/explore/featured/card/fun-with-arrays/526/deleting-items-from-an-array/3247/

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        nums.erase(remove(nums.begin(), nums.end(), val), nums.end());
        return nums.size();
    }
};

// Solution approaches; two pointers (O(n) time and O(1) space)
/* Approach 1: Two pointers
public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i;
}
*/