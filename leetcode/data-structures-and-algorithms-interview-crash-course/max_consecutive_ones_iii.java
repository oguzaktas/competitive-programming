class Solution {
    public int longestOnes(int[] nums, int k) {
        /*
        int left = 0, current = 0, answer = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                current++;
            }
            while (current > k) {
                if (nums[left] == 0) {
                    current--;
                }
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }
        return answer;
        */
        int left = 0, right;
        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                k--;
            }
            if (k < 0) {
                k += 1 - nums[left];
                left++;
            }
        }
        return right - left;
    }
}

// https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4595/