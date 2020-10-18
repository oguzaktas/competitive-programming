class Solution:
    def validMountainArray(self, A: List[int]) -> bool:
        i = 0
        while i + 1 < len(A) and A[i] < A[i + 1]:
            i += 1
        if i == 0 or i == len(A) - 1:
            return False
        while i + 1 < len(A) and A[i] > A[i + 1]:
            i += 1
        return i == len(A) - 1

# https://leetcode.com/explore/featured/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/

'''
One pass approach: If we walk along the mountain from left to right, we have to move strictly up, then strictly down.
Time complexity: O(N) [N is the length of A]. Space complexity: O(1)
Java solution with same approach;
class Solution {
    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;
        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;
        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;
        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;
        return i == N-1;
    }
}
'''