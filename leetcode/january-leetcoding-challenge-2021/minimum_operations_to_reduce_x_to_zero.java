class Solution {
    public int minOperations(int[] nums, int x) {
        int result = Integer.MAX_VALUE;
        int lSum = 0, lPt = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            lSum += nums[i];
            if (lSum == x) {
                result = i + 1;
            }
        }
        int rSum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            rSum += nums[i];
            while (lPt == i || (lPt >= 0 && lSum > x - rSum)) {
                lSum -= nums[lPt];
                lPt--;
            }
            if (lSum == x - rSum) {
                result = Math.min(result, lPt + 1 + nums.length - i);
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/580/week-2-january-8th-january-14th/3603/