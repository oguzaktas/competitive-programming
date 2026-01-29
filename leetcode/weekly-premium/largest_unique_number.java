class Solution {
    public int largestUniqueNumber(int[] nums) {
        // using array
        int[] arr = new int[1001];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] += 1;
        }
        /*
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (arr[nums[i]] == 1) {
                result = Math.max(result, nums[i]);
            }
        }
        */
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                return i;
            }
        }
        // return result;
        return -1;
        /* using HashMap
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        int result = -1;
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            if (entry.getValue() == 1) {
                result = Math.max(result, entry.getKey());
            }
        }
        return result;
        */
    }
}

// https://leetcode.com/problems/largest-unique-number/