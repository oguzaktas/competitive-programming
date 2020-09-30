class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0, temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
                if (temp > result) {
                    result = temp;
                }
            } else {
                temp = 0;
            }
        }
        return result;
    }
}

// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/