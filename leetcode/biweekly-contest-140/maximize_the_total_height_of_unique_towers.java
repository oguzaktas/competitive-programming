class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        Arrays.sort(maximumHeight);
        int n = maximumHeight.length;
        long sum = 0;
        int prevHeight = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            int assignedHeight = Math.min(maximumHeight[i], prevHeight - 1);
            if (assignedHeight <= 0) {
                return -1;
            }
            sum += assignedHeight;
            prevHeight = assignedHeight;
        }
        return sum;
    }
}

// https://leetcode.com/problems/maximize-the-total-height-of-unique-towers/