class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = nums1.length - 1, j = 0; i >= m; i--, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/580/week-2-january-8th-january-14th/3600/