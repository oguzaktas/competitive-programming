class Solution {
    public int missingNumber(int[] nums) {
        /*
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
        */
        int sum = nums.length * (nums.length + 1) / 2;
        int currentSum = 0;
        for (int i : nums) {
            currentSum += i;
        }
        return sum - currentSum;
    }
}

// https://leetcode.com/problems/missing-number/?envType=daily-question&envId=2024-02-20