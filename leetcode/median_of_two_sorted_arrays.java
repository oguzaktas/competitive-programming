class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length != 0) {
            if (nums2.length % 2 == 0) {
                return (double) (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]) / 2;
            } else {
                return (double) nums2[(nums2.length + 1) / 2 - 1];
            }
        }
        if (nums2.length == 0 && nums1.length != 0) {
            if (nums1.length % 2 == 0) {
                return (double) (nums1[nums1.length / 2 - 1] + nums1[nums1.length / 2]) / 2;
            } else {
                return (double) nums1[(nums1.length + 1) / 2 - 1];
            }
        }
        int[] nums = new int[nums1.length + nums2.length];
        mergeArrays(nums1, nums2, nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println("");
        if (nums.length % 2 == 0) {
            return (double) (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2;
        } else {
            return (double) nums[(nums.length + 1) / 2 - 1];
        }
    }
    
    public void mergeArrays(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }
    }
}

// https://leetcode.com/problems/median-of-two-sorted-arrays/