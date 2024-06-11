class Solution {
    public int numberOfChild(int n, int k) {
        int ball = 0;
        int direction = 1;
        for (int i = 0; i < k; i++) {
            ball += direction;
            if (ball == 0 || ball == n-1) {
                direction *= -1;
            }
        }
        return ball;
    }
}

// https://leetcode.com/contest/weekly-contest-401/problems/find-the-child-who-has-the-ball-after-k-seconds/