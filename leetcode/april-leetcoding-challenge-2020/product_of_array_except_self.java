class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] output = new int[nums.length];

        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        right[nums.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for(int i = 0; i < nums.length; i++) {
            output[i] = left[i] * right[i];
        }
        
        return output;
    }
}

// https://leetcode.com/problems/product-of-array-except-self/
// https://webrewrite.com/product-of-array-except-self/
// https://www.youtube.com/watch?v=khTiTSZ5QZY

/* My solution [Not Accepted - Time Limit Exceeded, Wrong Answer]
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                product *= nums[i];
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                output[j] = product / nums[j];
            }
        }
        return output;
    }
}
*/