class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        if (nums1[nums1.length-1] < nums2[0] || nums2[nums2.length-1] < nums1[0]) {
            return -1;
        }
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return -1;
        /*
        if (nums1[nums1.length-1] < nums2[0] || nums2[nums2.length-1] < nums1[0]) {
            return -1;
        }
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                return num;
            }
        }
        return -1;
        */
    }
}

// https://leetcode.com/problems/minimum-common-value/?envType=daily-question&envId=2024-03-09