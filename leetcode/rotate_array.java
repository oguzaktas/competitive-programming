class Solution {
    public void rotate(int[] nums, int k) {
        int previous, temp;
        k %= nums.length;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }    
        }
    }
}

// https://leetcode.com/problems/rotate-array/