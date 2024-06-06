class Solution {
    public int waysToSplitArray(int[] nums) {
        long left = 0, right = 0, total = 0;
        int answer = 0;
        for (int i : nums) {
            total += i;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            right = total - left;
            if (left >= right) {
                answer++;
            }
        }
        return answer;
        /*
        long[] prefix = new long[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int answer = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            long left = prefix[i];
            long right = prefix[nums.length - 1] - prefix[i];
            if (left >= right) {
                answer++;
            }
        }
        return answer;
        */
    }
}

// https://leetcode.com/problems/number-of-ways-to-split-array/