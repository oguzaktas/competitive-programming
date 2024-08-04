class Solution {
    public int partitionArray(int[] nums, int k) {
        // greedy approach
        Arrays.sort(nums);
        int result = 1, min = nums[0], max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            if (max - min > k) {
                result++;
                min = max = num;
            }
        }
        return result;
        /* bucket O(n) Solution
        int[] buckets = new int[(int) (Math.pow(10, 5) + 1)];
        int max = 0;
        for (int num : nums) {
            buckets[num]++;
            max = Math.max(max, num);
        }
        int result = 0,
        for (int i = 0; i <= max; i++) {
            if (buckets[i] > 0) {
                result++;
                i += k;
            }
        }
        return result;
        */
    }
}

// https://leetcode.com/problems/partition-array-such-that-maximum-difference-is-k/