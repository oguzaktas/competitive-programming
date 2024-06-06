class Solution {
    public int majorityElement(int[] nums) {
        // Boyer-Moore voting algorithm
        int count = 0, majorityElement = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majorityElement = nums[i];
            }
            count += (nums[i] == majorityElement) ? 1 : -1;
        }
        return majorityElement;
    }
    /*
    Arrays.sort(nums);
    return nums[nums.length / 2];
    */
}

// https://leetcode.com/problems/majority-element/?envType=daily-question&envId=2024-02-12