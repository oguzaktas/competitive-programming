class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i : nums) {
            int digits = 0;
            while (i != 0) {
                i /= 10;
                digits++;
            }
            if (digits % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}

// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/