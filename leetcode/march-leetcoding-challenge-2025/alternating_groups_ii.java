class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int left = 0, count = 0;
        for (int right = 1; right < colors.length + k - 1; right++) {
            if (colors[right % colors.length] == colors[(right - 1) % colors.length]) {
                left = right;
            }
            if (right - left + 1 >= k) {
                count++;
            }
        }
        return count;
    }
}

// https://leetcode.com/problems/alternating-groups-ii/?envType=daily-question&envId=2025-03-09