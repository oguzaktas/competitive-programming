class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] result = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            if ((nums.get(i) & 1) == 1) {
                result[i] = nums.get(i) & ~(((nums.get(i) + 1) & ~nums.get(i)) >> 1);
            } else {
                result[i] = -1;
            }
        }
        return result;
    }
}

// https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/?envType=daily-question&envId=2026-01-20