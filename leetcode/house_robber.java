class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];
    }
}

// https://leetcode.com/problems/house-robber/
/* C++ solution;
class Solution {
public:
    int rob(vector<int>& a) {
        int n = a.size();
        if (n == 0) 
        {
            return 0;
        }
        int temp[n];
        temp[0] = a[0];
        if (n == 1) {
            return temp[0];
        }
        temp[1] = max(a[0], a[1]);
        for (int i = 2; i<n; i++) {
            temp[i] = max(a[i] + temp[i-2], temp[i-1]);
        }
        return *max_element(temp, temp+n);
    }
};
*/