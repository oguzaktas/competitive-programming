class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] copy = nums.clone();
        Arrays.sort(copy);
        int start = 0;
        while (start < nums.length && nums[start] == copy[start]) {
            start++;
        }
        int end = nums.length - 1;
        while (end > start && nums[end] == copy[end]) {
            end--;
        }
        return end - start + 1;
    }
}

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/587/week-4-february-22nd-february-28th/3652/