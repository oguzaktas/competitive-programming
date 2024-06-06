class Solution {
    public int numberOfRounds(String startTime, String finishTime) {
        int start = Integer.parseInt(startTime.substring(0, 2)) * 60 + Integer.parseInt(startTime.substring(3, 5));
        int end = Integer.parseInt(finishTime.substring(0, 2)) * 60 + Integer.parseInt(finishTime.substring(3, 5));
        int roundedStart = ((start + 14) / 15) * 15;
        int roundedEnd = (end / 15) * 15;
        if (start < end) {
            return Math.max(0, (roundedEnd - roundedStart) / 15);
        }
        return (24 * 60 - roundedStart + roundedEnd) / 15;
    }
}

// https://leetcode.com/problems/the-number-of-full-rounds-you-have-played/