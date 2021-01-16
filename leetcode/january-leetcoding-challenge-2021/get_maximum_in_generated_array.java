class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 1; 2 * i < n; i++) {
            nums[2 * i] = nums[i];
            nums[2 * i + 1] = nums[i] + nums[i + 1];
        }
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/581/week-3-january-15th-january-21st/3605/

/*
class Solution {
    public int getMaximumGenerated(int n) {
        if(n < 2)
            return n;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int max = 0;
        for(int i = 2; i <= n; i++) {
            nums[i] = nums[i / 2];
            if(i % 2 == 1)
                nums[i] += nums[i / 2 + 1];
            max = Math.max(max, nums[i]);
        }       
        return max;
    }
}
*/

/* C++ solution;
int getMaximumGenerated(int n) {
	if (n == 0) 
	    return 0;
	vector<int> nums(n + 1);
	nums[1] = 1;
	int maxnum = 1;
	for(int i = 2; i <= n; ++i) {
		nums[i] = i % 2 ? nums[(i - 1) / 2] + nums[(i - 1) / 2 + 1] : nums[i / 2];
		maxnum = max(maxnum, nums[i]);
	}
	return maxnum;
}
*/