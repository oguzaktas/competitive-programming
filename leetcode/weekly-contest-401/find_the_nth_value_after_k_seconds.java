class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int mod = 1000000007;
        int[] a = new int[n];
        Arrays.fill(a, 1);
        for (int i = 0; i < k; i++) {
            int[] b = new int[n];
            b[0] = a[0];
            for (int j = 1; j < n; j++) {
                b[j] = (b[j - 1] + a[j]) % mod;
            }
            a = b;
        }
        return a[n - 1];
    }
}

// https://leetcode.com/contest/weekly-contest-401/problems/find-the-n-th-value-after-k-seconds/