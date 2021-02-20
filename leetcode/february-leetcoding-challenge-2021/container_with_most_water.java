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

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/586/week-3-february-15th-february-21st/3643/

/*
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                max = Math.max(max, height[left] * (right - left));
                left++;
            } else {
                max = Math.max(max, height[right] * (right - left));
                right--;
            }
        }
        return max;
    }
}
*/