class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

// https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/