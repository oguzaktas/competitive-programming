class Solution {
    public int minSwaps(int[] data) {
        int totalOnes = (int) Arrays.stream(data).filter(x -> x == 1).count();
        if (totalOnes == 0 || totalOnes == 1) {
            return 0;
        }
        int onesInWindow = 0;
        for (int i = 0; i < totalOnes; i++) {
            if (data[i] == 1) {
                onesInWindow++;
            }
        }
        int maxOnesInWindow = onesInWindow;
        for (int i = totalOnes; i < data.length; i++) {
            if (data[i - totalOnes] == 1) {
                onesInWindow--;
            }
            if (data[i] == 1) {
                onesInWindow++;
            }
            maxOnesInWindow = Math.max(maxOnesInWindow, onesInWindow);
        }
        return totalOnes - maxOnesInWindow;
    }
}

// https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together/