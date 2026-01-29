class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
            s = new StringBuilder(s).reverse().toString();
        }
        int aCount = 0, bCount = 0, totalPoints = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                aCount++;
            } else if (c == 'b') {
                if (aCount > 0) {
                    aCount--;
                    totalPoints += x;
                } else {
                    bCount++;
                }
            } else {
                totalPoints += Math.min(bCount, aCount) * y;
                aCount = bCount = 0;
            }
        }
        totalPoints += Math.min(bCount, aCount) * y;
        return totalPoints;
    }
}

// https://leetcode.com/problems/maximum-score-from-removing-substrings/?envType=daily-question&envId=2025-07-23