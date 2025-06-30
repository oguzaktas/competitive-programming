class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int odds = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                odds++;
            } else {
                odds = 0;
            }
            if (odds == 3) {
                return true;
            }
        }
        return false;
    }
}

// https://leetcode.com/problems/three-consecutive-odds/?envType=daily-question&envId=2025-05-11