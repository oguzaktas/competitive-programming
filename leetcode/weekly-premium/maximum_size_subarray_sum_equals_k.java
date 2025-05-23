class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        int prefixSum = 0, max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            if (prefixSum == k) {
                max = i + 1;
            }
            if (map.containsKey(prefixSum - k)) {
                max = Math.max(max, i - map.get(prefixSum - k));
            }
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        return max;
    }
}

// https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/