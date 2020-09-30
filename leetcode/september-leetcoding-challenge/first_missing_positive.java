class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i = 1;
        while (true) {
            if (!contains(nums, i)) {
                return i;
            }
            i++;
        }
    }
    public boolean contains(int[] array, int number) {
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

// https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/558/week-5-september-29th-september-30th/3478/