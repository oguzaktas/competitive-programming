class Solution {
    public int mostBooked(int n, int[][] meetings) {
        long[] roomAvailabilityTime = new long[n];
        int[] count = new int[n];
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];
            long minRoomAvailabilityTime = Long.MAX_VALUE;
            int minAvailableTimeRoom = 0;
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (roomAvailabilityTime[i] <= start) {
                    found = true;
                    count[i]++;
                    roomAvailabilityTime[i] = end;
                    break;
                }
                if (minRoomAvailabilityTime > roomAvailabilityTime[i]) {
                    minRoomAvailabilityTime = roomAvailabilityTime[i];
                    minAvailableTimeRoom = i;
                }
            }
            if (!found) {
                roomAvailabilityTime[minAvailableTimeRoom] += end - start;
                count[minAvailableTimeRoom]++;
            }
        }
        int maxMeeting = 0, maxMeetingRoom = 0;
        for (int i = 0; i < n; i++) {
            if (count[i] > maxMeeting) {
                maxMeeting = count[i];
                maxMeetingRoom = i;
            }
        }
        return maxMeetingRoom;
    }
}

// https://leetcode.com/problems/meeting-rooms-iii/?envType=daily-question&envId=2024-02-18