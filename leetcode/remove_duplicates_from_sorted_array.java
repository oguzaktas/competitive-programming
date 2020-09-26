class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            int i = 1;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i - 1]) {
                    i++;
                    nums[i - 1] = nums[j];
                }
            }
            return i;
        }
    }
}

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/