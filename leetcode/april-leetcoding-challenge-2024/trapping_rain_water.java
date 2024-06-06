class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = height[0], rightMax = height[right];
        int water = 0;
        while (left < right) {
            if (leftMax <= rightMax) {
                water += leftMax - height[left];
                left++;
                leftMax = Math.max(leftMax, height[left]);
            } else {
                water += rightMax - height[right];
                right--;
                rightMax = Math.max(rightMax, height[right]);
            }
        }
        return water;
    }
}

// https://leetcode.com/problems/trapping-rain-water/?envType=daily-question&envId=2024-04-12