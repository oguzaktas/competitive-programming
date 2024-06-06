class Solution {
    public int pivotInteger(int n) {
        int sum = n * (n+1) / 2;
        int pivot = (int) Math.sqrt(sum);
        return pivot * pivot == sum ? pivot : -1;
        /*
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            if (i * (i+1) / 2 == n * (n+1) / 2 - i * (i-1) / 2) {
                return i;
            }
        }
        return -1;
        */
    }
}

// https://leetcode.com/problems/find-the-pivot-integer/?envType=daily-question&envId=2024-03-13