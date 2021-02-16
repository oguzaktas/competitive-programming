class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < squares.length; i++) {
            squares[i] *= squares[i];
        }
        Arrays.sort(squares);
        return squares;
    }
}

// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
