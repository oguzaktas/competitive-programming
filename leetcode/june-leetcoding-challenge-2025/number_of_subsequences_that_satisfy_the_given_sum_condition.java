class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = 1_000_000_007;
        int[] power = new int[nums.length];
        power[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }
        int answer = 0;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                answer = (answer + power[right - left]) % mod;
                left++;
            } else {
                right--;
            }
        }
        return answer;
    }
}

// https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/?envType=daily-question&envId=2025-06-29