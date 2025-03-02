class Solution {
    public int[] transformArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i] % 2 == 0) ? 0 : 1;
        }
        Arrays.sort(nums);
        return nums;
    }
}

// https://leetcode.com/contest/biweekly-contest-151/problems/transform-array-by-parity/