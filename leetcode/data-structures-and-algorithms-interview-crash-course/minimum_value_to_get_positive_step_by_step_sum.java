class Solution {
    public int minStartValue(int[] nums) {
        int min = 0, total = 0;
        for (int num : nums) {
            total += num;
            min = Math.min(min, total);
        }
        return -min+1;
    }
}

// https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4657/