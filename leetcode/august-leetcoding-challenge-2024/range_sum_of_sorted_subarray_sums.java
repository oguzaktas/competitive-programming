class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int[] subarrays = new int[n * (n + 1) / 2];
        for (int i = 0; i < n; i++) {
            subarrays[i] = prefix[i];
        }
        int index = n;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                subarrays[index] = prefix[j] - prefix[i - 1];
                index++;
            }
        }
        Arrays.sort(subarrays);
        long sum = 0;
        while (left <= right) {
            sum += subarrays[left - 1];
            sum = sum % 1000000007;
            left++;
        }
        return (int) sum;
    }
}

// https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/?envType=daily-question&envId=2024-08-04