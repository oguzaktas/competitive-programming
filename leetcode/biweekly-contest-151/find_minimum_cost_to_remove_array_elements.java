class Solution {
    int[] nums;
    int n;
    int[][] dp;

    public int minCost(int[] nums) {
        this.nums = nums;
        
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        
        dp = new int[nums.length][nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        
        int res1 = Math.max(nums[0], nums[1]) + f(2, 3);
        int res2 = Math.max(nums[0], nums[2]) + f(1, 3);
        int res3 = Math.max(nums[1], nums[2]) + f(0, 3);
        
        return Math.min(res1, Math.min(res2, res3));
    }
    
    private int f(int l, int j) {
        if (j == n) {
            return nums[l];
        } else if (j == n - 1) {
            return Math.max(nums[l], nums[j]);
        }
        
        if (dp[l][j] != -1) {
            return dp[l][j];
        }
        
        // option 1: remove nums[l] and nums[j], cost = max(nums[l], nums[j])
        int op1 = Math.max(nums[l], nums[j]) + f(j + 1, j + 2);
        // option 2: remove nums[l] and nums[j+1], cost = max(nums[l], nums[j+1])
        int op2 = Math.max(nums[l], nums[j + 1]) + f(j, j + 2);
        // option 3: remove nums[j] and nums[j+1], cost = max(nums[j], nums[j+1])
        int op3 = Math.max(nums[j], nums[j + 1]) + f(l, j + 2);
        
        int ans = Math.min(op1, Math.min(op2, op3));
        dp[l][j] = ans;
        return ans;
    }
}

// https://leetcode.com/contest/biweekly-contest-151/problems/find-minimum-cost-to-remove-array-elements/