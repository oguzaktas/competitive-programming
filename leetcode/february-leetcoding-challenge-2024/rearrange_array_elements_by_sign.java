class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[posIndex] = nums[i];
                posIndex += 2;
            } else {
                result[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return result;
        /*
        List<Integer> positive = new ArrayList<Integer>();
        List<Integer> negative = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positive.add(nums[i]);
            } else {
                negative.add(nums[i]);
            }
        }
        int[] result = new int[nums.length];
        for (int i = 0, j = 0, k = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = positive.get(j);
                j++;
            } else {
                result[i] = negative.get(k);
                k++;
            }
        }
        return result;
        */
    }
}

// https://leetcode.com/problems/rearrange-array-elements-by-sign/?envType=daily-question&envId=2024-02-14