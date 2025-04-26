class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int max = 0, min = 0, current = 0;
        for (int i = 0; i < differences.length; i++) {
            current += differences[i];
            max = Math.max(max, current);
            min = Math.min(min, current);
            if (max - min > upper - lower) {
                return 0;
            }
        }
        return (upper - lower) - (max - min) + 1;
    }
}

// https://leetcode.com/problems/count-the-hidden-sequences/?envType=daily-question&envId=2025-04-21