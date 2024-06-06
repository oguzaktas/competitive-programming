class Solution {
    public int[] productExceptSelf(int[] nums) {
        // O(1) space complexity solution
        int[] answer = new int[nums.length];
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i-1] * nums[i-1];
        }
        int right = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right *= nums[i];
        }
        return answer;
        /* left and right product arrays solution
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] answer = new int[nums.length];
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        right[nums.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for(int i = 0; i < nums.length; i++) {
            answer[i] = left[i] * right[i];
        }
        return answer;
        */
    }
}

// https://leetcode.com/problems/product-of-array-except-self/?envType=daily-question&envId=2024-03-15