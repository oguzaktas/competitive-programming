class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        int currentSum = nums[0];
        int largestSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max((currentSum + nums[i]), nums[i]);
            largestSum = Math.max(largestSum, currentSum);
        }
        return largestSum;
    }
}