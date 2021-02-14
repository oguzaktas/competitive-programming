class Solution {
    public int maxArea(int[] height) {
        int container = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                container = Math.max(container, (j - i) * Math.min(height[i], height[j]));
            }
        }
        return container;
    }
}

// https://leetcode.com/problems/container-with-most-water/