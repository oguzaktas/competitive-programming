class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int right = 0, left = nums.length - 1;
        for (int i = squares.length - 1; i >= 0; i--) {
            if (Math.abs(nums[right]) >= Math.abs(nums[left])) {
                squares[i] = nums[right] * nums[right];
                right++;
            } else {
                squares[i] = nums[left] * nums[left];
                left--;
            }
        }
        return squares;
    }
}

// https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4689/