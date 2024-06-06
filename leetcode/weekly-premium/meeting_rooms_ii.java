class Solution {
    public int minMeetingRooms(int[][] intervals) {
        // using PriorityQueue
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < intervals.length; i++) {
            if (!pq.isEmpty() && pq.peek() <= intervals[i][0]) {
                pq.poll();
            }
            pq.offer(intervals[i][1]);
        }
        return pq.size();
        /*
        if (intervals.length == 0) {
            return 0;
        }
        Integer[] start = new Integer[intervals.length];
        Integer[] end = new Integer[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(
            end,
            new Comparator<Integer>() {
                public int compare(Integer a, Integer b) {
                    return a - b;
                }
            }
        );
        Arrays.sort(
            start,
            new Comparator<Integer>() {
                public int compare(Integer a, Integer b) {
                    return a - b;
                }
            }
        );
        int startPointer = 0, endPointer = 0, usedRooms = 0;
        while (startPointer < intervals.length) {
            if (start[startPointer] >= end[endPointer]) {
                usedRooms -= 1;
                endPointer += 1;
            }
            usedRooms += 1;
            startPointer += 1;
        }
        return usedRooms;
        */
    }
}

// https://leetcode.com/problems/meeting-rooms-ii/