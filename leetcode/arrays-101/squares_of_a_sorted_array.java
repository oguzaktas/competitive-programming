class Solution {
    public int[] sortedSquares(int[] A) {
        int[] sortedArray = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            sortedArray[i] = A[i] * A[i];
        }
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}

// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/