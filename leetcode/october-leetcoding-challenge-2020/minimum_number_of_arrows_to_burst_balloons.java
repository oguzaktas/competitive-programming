class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (p1, p2) -> Integer.compare(p1[1], p2[1]));
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

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/560/week-2-october-8th-october-14th/3490/