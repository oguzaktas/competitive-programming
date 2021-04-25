class Solution {
    public int sumBase(int n, int k) {
        int sum = 0, step;
        while (n > 0) {
            step = n % k;
            sum += step;
            n /= k;
        }
        return sum;
    }
}

// https://leetcode.com/contest/weekly-contest-238/problems/sum-of-digits-in-base-k/