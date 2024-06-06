class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int answer = 0, left = 0, product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            while (product >= k) {
                product /= nums[left];
                left++;
            }
            answer += i - left + 1;
        }
        return answer;
    }
}

// https://leetcode.com/problems/subarray-product-less-than-k/?envType=daily-question&envId=2024-03-27