class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int minIncrements = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]) {
                int increment = nums[i-1] + 1 - nums[i];
                minIncrements += increment;
                nums[i] = nums[i-1] + 1;
            }
        }
        return minIncrements;
    }
}

// https://leetcode.com/problems/minimum-increment-to-make-array-unique/?envType=daily-question&envId=2024-06-14