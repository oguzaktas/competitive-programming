class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long answer = 0;
        int min = -1, max = -1, leftBound = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                leftBound = i;
            }
            if (nums[i] == minK) {
                min = i;
            }
            if (nums[i] == maxK) {
                max = i;
            }
            answer += Math.max(0, Math.min(max, min) - leftBound);
        }
        return answer;
    }
}

// https://leetcode.com/problems/count-subarrays-with-fixed-bounds/?envType=daily-question&envId=2025-04-26