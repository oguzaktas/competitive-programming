class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i <= nums.length; i++) {
            if (nums.length - binarySearch(nums, i) == i) {
                return i;
            }
        }
        return -1;
    }

    private int binarySearch(int[] nums, int val) {
        int start = 0, end = nums.length - 1;
        int index = nums.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] >= val) {
                index = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
}

// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/?envType=daily-question&envId=2024-05-27