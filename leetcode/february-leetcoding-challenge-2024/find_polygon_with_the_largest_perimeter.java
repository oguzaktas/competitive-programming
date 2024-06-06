class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        long result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < sum) {
                result = sum + nums[i];
            }
            sum += nums[i];
        }
        return result;
    }
}

// https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/?envType=daily-question&envId=2024-02-15