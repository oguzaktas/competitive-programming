class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[51];
        
        for (int i = 0; i <= n - k; i++) {
            boolean[] seen = new boolean[51];
            for (int j = i; j < i + k; j++) {
                int num = nums[j];
                if (!seen[num]) {
                    count[num]++;
                    seen[num] = true;
                }
            }
        }
        
        for (int x = 50; x >= 0; x--) {
            if (count[x] == 1) {
                return x;
            }
        }
        
        return -1;
    }
}

// https://leetcode.com/contest/weekly-contest-439/problems/find-the-largest-almost-missing-integer/