class Solution {
    public int subsetXORSum(int[] nums) {
        // return XORSum(nums, 0, 0);
        int result = 0;
        for (int num : nums) {
            result |= num;
        }
        return result << (nums.length - 1);
    }

    /*
    private int XORSum(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            return currentXOR;
        }
        int withElement = XORSum(nums, index + 1, currentXOR ^ nums[index]);
        int withoutElement = XORSum(nums, index + 1, currentXOR);
        return withElement + withoutElement;
    }
    */
}

// https://leetcode.com/problems/sum-of-all-subset-xor-totals/?envType=daily-question&envId=2024-05-20