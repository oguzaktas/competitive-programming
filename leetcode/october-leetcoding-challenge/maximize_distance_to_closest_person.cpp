class Solution {
public:
    int maxDistToClosest(vector<int>& seats) {
        int distance = 0, last = -1, n = seats.size();
        for (int i = 0; i < seats.size(); i++) {
            if (seats[i] == 1) {
                distance = last < 0 ? i : max(distance, (i - last) / 2);
                last = i;
            }
        }
        distance = max(distance, n - last - 1);
        return distance;
    }
};

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/563/week-5-october-29th-october-31st/3512/

/* Java solution same approach;
public int maxDistToClosest(int[] seats) {
    int res = 0, n = seats.length, last = -1;
    for (int i = 0; i < n; ++i) {
        if (seats[i] == 1) {
            res = last < 0 ? i : Math.max(res, (i - last) / 2);
            last = i;
        }
    }
    res = Math.max(res, n - last - 1);
    return res;
}
*/
/* Python solution;
def maxDistToClosest(self, seats):
    res, last, n = 0, -1, len(seats)
    for i in range(n):
        if seats[i]:
            res = max(res, i if last < 0 else (i - last) / 2)
            last = i
    return max(res, n - last - 1)
*/