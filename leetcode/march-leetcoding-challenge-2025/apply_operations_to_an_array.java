class Solution {
    public int[] applyOperations(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1] && nums[i] != 0) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }

            if (nums[i] != 0) {
                if (i != index) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                }
                index++;
            }
        }
        return nums;
    }
}

// https://leetcode.com/problems/apply-operations-to-an-array/?envType=daily-question&envId=2025-03-01