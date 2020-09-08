class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[n * 2];
        for (int i = 0, j = 0; j < n; i+=2, j++) {
            result[i] = nums[j];
        }
        for (int i = 1, j = n; j < n * 2; i+=2, j++) {
            result[i] = nums[j];
        }
        return result;
    }
}

// https://leetcode.com/problems/shuffle-the-array/
/* https://www.youtube.com/watch?v=hpg65ugGG3E
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for(int i = 0; i < nums.length; i++)
            res[i] = i % 2 == 0 ? nums[i/2] : nums[n + i/2];
        return res;
    }
}
*/