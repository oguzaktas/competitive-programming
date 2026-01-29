class Solution {
    public int findFinalValue(int[] nums, int original) {
        // O(n) solution using array
        boolean[] arr = new boolean[1001];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = true;
        }
        while (original <= 1000 && arr[original]) {
            original *= 2;
        }
        return original;
        /* O(n) solution using HashSet
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        while (set.contains(original)) {
            original *= 2;
        }
        return original;
        */
    }
}

// https://leetcode.com/problems/keep-multiplying-found-values-by-two/?envType=daily-question&envId=2025-11-19