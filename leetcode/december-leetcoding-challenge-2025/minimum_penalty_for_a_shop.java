class Solution {
    public int bestClosingTime(String customers) {
        int minPenalty = 0, currentPenalty = 0, earliestHour = 0;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                currentPenalty--;
            } else {
                currentPenalty++;
            }
            if (currentPenalty < minPenalty) {
                earliestHour = i + 1;
                minPenalty = currentPenalty;
            }
        }
        return earliestHour;
    }
}

// https://leetcode.com/problems/minimum-penalty-for-a-shop/?envType=daily-question&envId=2025-12-26