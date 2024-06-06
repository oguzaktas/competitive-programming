class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        for (int num : nums) {
            if (num > 0 && num <= nums.length) {
                arr[num-1] = true;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (!arr[i]) {
                return i+1;
            }
        }
        return nums.length+1;
        /*
        Arrays.sort(nums);
        int i = 1;
        while (true) {
            if (!contains(nums, i)) {
                return i;
            }
            i++;
        }
        */
    }

    private boolean contains(int[] array, int number) {
        boolean result = false;
        for (int i : array) {
            if (i == number) {
                result = true;
                break;
            }
        }
        return result;
    }
}

// https://leetcode.com/problems/first-missing-positive/?envType=daily-question&envId=2024-03-26