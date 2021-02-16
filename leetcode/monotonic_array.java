class Solution {
    public boolean isMonotonic(int[] A) {
        boolean result = true;
        boolean isIncreasing = false, isDecreasing = false;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                isIncreasing = true;
            }
            if (A[i] < A[i - 1]) {
                isDecreasing = true;
            }
            if (isIncreasing) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[j] < A[j - 1]) {
                        return false;
                    }
                }
                break;
            }
            if (isDecreasing) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[j] > A[j - 1]) {
                        return false;
                    }
                }
                break;
            }
        }
        return result;
    }
}

// https://leetcode.com/problems/monotonic-array/