class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sumOfDigits(nums[i]);
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    
    private int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;  // Add the last digit to sum
            num /= 10;        // Remove the last digit
        }
        return sum;
    }
}

// https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/