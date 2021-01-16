class Solution {
    int count = 0;
    public int countArrangement(int n) {
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++)
            nums[i - 1] = i;
        permute(nums, 0);
        return count;
    }
    
    public void permute(int[] nums, int l) {
        if (l == nums.length) {
            count++;
        }
        for (int i = l; i < nums.length; i++) {
            swap(nums, i, l);
            if (nums[l] % (l + 1) == 0 || (l + 1) % nums[l] == 0)
                permute(nums, l + 1);
            swap(nums, i, l);
        }
    }
    
    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3591/

/* Brute force approach (Time Limit Exceeded)
class Solution {
    int count = 0;
    public int countArrangement(int n) {
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++)
            nums[i - 1] = i;
        permute(nums, 0);
        return count;
    }
    
    public void permute(int[] nums, int l) {
        if (l == nums.length - 1) {
            int i;
            for (i = 1; i <= nums.length; i++) {
                if (nums[i - 1] % i != 0 && i % nums[i - 1] != 0) {
                    break;
                }
            }
            if (i == nums.length + 1) {
                count++;
            }
        }
        for (int i = l; i < nums.length; i++) {
            swap(nums, i, l);
            permute(nums, l + 1);
            swap(nums, i, l);
        }
    }
    
    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

}
*/