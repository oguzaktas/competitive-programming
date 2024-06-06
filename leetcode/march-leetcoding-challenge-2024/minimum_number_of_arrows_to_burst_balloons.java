class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (p1, p2)->Integer.compare(p1[1], p2[1]));
        int furthest = points[0][1], count = 1;
        for (int[] point : points) {
            if (point[0] > furthest) {
                count++;
                furthest = point[1];
            }
        }
        return count;
    }
}

// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/?envType=daily-question&envId=2024-03-18