class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        int maxLength = Math.max(nums1.length, nums2.length);
        for (int i = 0; i < maxLength; i++) {
            if (i < nums1.length) {
                map.put(nums1[i][0], map.getOrDefault(nums1[i][0], 0) + nums1[i][1]);
            }
            if (i < nums2.length) {
                map.put(nums2[i][0], map.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
            }
        }
        int[][] result = new int[map.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[index][0] = entry.getKey();
            result[index][1] = entry.getValue();
            index++;
        }
        return result;
        /* two pointers approach O(n1 + n2) solution
        int ptr1 = 0, ptr2 = 0;
        List<int[]> mergedArray = new ArrayList<>();
        while (ptr1 < nums1.length && ptr2 < nums2.length) {
            if (nums1[ptr1][0] == nums2[ptr2][0]) {
                mergedArray.add(new int[] {
                    nums1[ptr1][0],
                    nums1[ptr1][1] + nums2[ptr2][1]
                });
                ptr1++;
                ptr2++;
            } else if (nums1[ptr1][0] < nums2[ptr2][0]) {
                mergedArray.add(nums1[ptr1]);
                ptr1++;
            } else {
                mergedArray.add(nums2[ptr2]);
                ptr2++;
            }
        }

        while (ptr1 < nums1.length) {
            mergedArray.add(nums1[ptr1]);
            ptr1++;
        }
        while (ptr2 < nums2.length) {
            mergedArray.add(nums2[ptr2]);
            ptr2++;
        }

        // convert List<int[]> to int[][]
        int[][] result = new int[mergedArray.size()][2];
        for (int i = 0; i < mergedArray.size(); i++) {
            result[i] = mergedArray.get(i);
        }
        return result;
        */
    }
}

// https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/?envType=daily-question&envId=2025-03-02