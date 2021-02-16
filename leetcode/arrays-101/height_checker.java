class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sorted);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                count++;
            }
        }
        return count;
    }
}

// https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3228/