class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left = 0, prefixZeros = 0, current = 0, count = 0;
        for (int right = 0; right < nums.length; right++) {
            current += nums[right];
            while (left < right && (nums[left] == 0 || current > goal)) {
                if (nums[left] == 1) {
                    prefixZeros = 0;
                } else {
                    prefixZeros++;
                }
                current -= nums[left];
                left++;
            }
            if (current == goal) {
                count += 1 + prefixZeros;
            }
        }
        return count;
        /* prefix sum
        int count = 0, current = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            current += nums[i];
            if (current == goal) {
                count++;
            }
            if (map.containsKey(current - goal)) {
                count += map.get(current - goal);
            }
            map.put(current, map.getOrDefault(current, 0) + 1);
        }
        return count;
        */
    }
}

// https://leetcode.com/problems/binary-subarrays-with-sum/?envType=daily-question&envId=2024-03-14