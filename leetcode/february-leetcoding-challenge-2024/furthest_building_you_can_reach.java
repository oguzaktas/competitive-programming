class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < heights.length - 1; i++) {
            int d = heights[i + 1] - heights[i];
            if (d > 0) {
                pq.add(d);
            }
            if (pq.size() > ladders) {
                bricks -= pq.remove();
            }
            if (bricks < 0) {
                return i;
            }
        }
        return heights.length - 1;
    }
}

// https://leetcode.com/problems/furthest-building-you-can-reach/?envType=daily-question&envId=2024-02-17