class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                sum++;
            }
        }
        return sum;
    }
}

// https://leetcode.com/problems/height-checker/?envType=daily-question&envId=2024-06-10