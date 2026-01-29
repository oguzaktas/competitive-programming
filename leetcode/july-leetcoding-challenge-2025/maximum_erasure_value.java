class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        boolean[] arr = new boolean[10001];
        int result = 0, currentSum = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            // while (set.contains(nums[right])) {
            while (arr[nums[right]]) {
                // set.remove(nums[left]);
                arr[nums[left]] = false;
                currentSum -= nums[left];
                left++;
            }
            // set.add(nums[right]);
            arr[nums[right]] = true;
            currentSum += nums[right];
            result = Math.max(result, currentSum);
        }
        return result;
    }
}

// https://leetcode.com/problems/maximum-erasure-value/?envType=daily-question&envId=2025-07-22