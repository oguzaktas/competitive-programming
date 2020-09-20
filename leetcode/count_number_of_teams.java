class Solution {
    public int numTeams(int[] rating) {
        int count = 0;
        for (int i = 0; i < rating.length; i++) {
            int lesserCount = 0;
            int greaterCount = 0;
            for (int j = 0; j < i; j++) {
                if (rating[i] > rating[j]) {
                    lesserCount++;
                }
            }
            for (int j = i + 1; j < rating.length; j++) {
                if (rating[i] < rating[j]) {
                    greaterCount++;
                }
            }
            count += lesserCount * greaterCount;
            count += (i - lesserCount) * (rating.length - 1 - i - greaterCount);
        }
        return count;
    }
}

// https://leetcode.com/problems/count-number-of-teams/