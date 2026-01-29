class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = k;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (count < k) {
                    return false;
                }
                count = 0;
            } else {
                count++;
            }
        }
        return true;
    }
}

// https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/?envType=daily-question&envId=2025-11-17