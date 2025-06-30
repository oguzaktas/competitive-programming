class Solution {
    public void sortColors(int[] nums) {
        int left = 0, current = 0;
        int right = nums.length - 1;
        int temp;
        while (current <= right) {
            if (nums[current] == 0) {
                temp = nums[left];
                nums[left++] = nums[current];
                nums[current++] = temp;
            } else if (nums[current] == 2) {
                temp = nums[current];
                nums[current] = nums[right];
                nums[right--] = temp;
            } else {
                current++;
            }
        } 
    }
}

// https://leetcode.com/problems/sort-colors/?envType=daily-question&envId=2025-05-17