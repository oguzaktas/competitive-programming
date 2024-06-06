class Solution {
public:
    int minDominoRotations(vector<int>& A, vector<int>& B) {
        vector<int> countA(7), countB(7), same(7);
        for (int i = 0; i < A.size(); i++) {
            countA[A[i]]++;
            countB[B[i]]++;
            if (A[i] == B[i]) {
                same[A[i]]++;
            }
        }
        for (int i = 1; i < 7; i++) {
            if (countA[i] + countB[i] - same[i] == A.size()) {
                return A.size() - max(countA[i], countB[i]);
            }
        }
        return -1;
    }
};

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/561/week-3-october-15th-october-21st/3500/

// https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/discuss/252242/JavaC%2B%2BPython-Different-Ideas