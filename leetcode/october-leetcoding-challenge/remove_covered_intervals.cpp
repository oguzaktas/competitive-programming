class Solution {
public:
    int removeCoveredIntervals(vector<vector<int>>& intervals) {
        int result = 0;
        int left = -1, right = -1;
        sort(intervals.begin(), intervals.end());
        for (auto &i : intervals) {
            if (i[0] > left && i[1] > right) {
                left = i[0];
                result++;
            }
            right = max(right, i[1]);
        }
        return result;
    }
};

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3483/