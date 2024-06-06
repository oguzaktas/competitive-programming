class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int[] arr = new int[nums.length + 1];
        int count = 0, left = 0, right = 0, current = 0;
        while (right < nums.length) {
            if (arr[nums[right++]]++ == 0) {
                k--;
            }
            if (k < 0) {
                --arr[nums[left++]];
                k++;
                current = 0;
            }
            if (k == 0) {
                while (arr[nums[left]] > 1) {
                    --arr[nums[left++]];
                    current++;
                }
                count += current + 1;
            }
        }
        return count;
    }
}

// https://leetcode.com/problems/subarrays-with-k-different-integers/?envType=daily-question&envId=2024-03-30