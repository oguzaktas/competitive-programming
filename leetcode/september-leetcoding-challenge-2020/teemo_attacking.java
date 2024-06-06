class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (i != 0 && duration > timeSeries[i] - timeSeries[i - 1]) {
                result += timeSeries[i] - timeSeries[i - 1];
            } else {
                result += duration;
            }
        }
        return result;
    }
}

// https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/557/week-4-september-22nd-september-28th/3473/