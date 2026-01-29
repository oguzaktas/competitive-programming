class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int index = binarySearch(nums, target);
        if (index == nums.length || nums[index] != target) {
            return index + nums.length / 2 < nums.length && nums[index + nums.length / 2] == target;
        }
        int count = nums.length / 2 + 1;
        return index + count <= nums.length && nums[index + count - 1] == target;
    }
    
    private int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

// https://leetcode.com/problems/check-if-a-number-is-majority-element-in-a-sorted-array/