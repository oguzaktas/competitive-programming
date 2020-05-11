// https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3306/

/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * class BinaryMatrix {
 *   public:
 *     int get(int x, int y);
 *     vector<int> dimensions();
 * };
 */

class Solution {
public:
    int leftMostColumnWithOne(BinaryMatrix &binaryMatrix) {
        vector<int> vec = binaryMatrix.dimensions();
        int h = vec[0], w = vec[1];
        int answer = w;
        for (int row = 0; row < h; row++) {
            int low = 0, high = w - 1;
            // first one
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (binaryMatrix.get(row, mid) == 1) {
                    answer = min(answer, mid);
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        if (answer == w) {
            answer = -1;
        }
        return answer;
    }
};