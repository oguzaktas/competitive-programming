class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int right = 0, left = 0, zeroNumber = 0, result = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroNumber++;
            }
            while (zeroNumber > 1) {
                if (nums[left] == 0) {
                    zeroNumber--;
                }
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}

// https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3230/