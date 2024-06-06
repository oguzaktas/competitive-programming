class Solution {
    public int[] getAverages(int[] nums, int k) {
        // sliding window O(n) solution
        if (k == 0) {
            return nums;
        }
        int[] avgs = new int[nums.length];
        Arrays.fill(avgs, -1);
        int windowSize = 2 * k + 1;
        if (windowSize > nums.length) {
            return avgs;
        }
        long windowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            windowSum += nums[i];
        }
        avgs[k] = (int)(windowSum / windowSize);
        for (int i = windowSize; i < nums.length; i++) {
            windowSum = windowSum - nums[i - windowSize] + nums[i];
            avgs[i - k] = (int)(windowSum / windowSize);
        }
        return avgs;
        /* prefix sum O(n) solution
        if (k == 0) {
            return nums;
        }
        int windowSize = 2 * k + 1;
        int[] avgs = new int[nums.length];
        Arrays.fill(avgs, -1);
        if (windowSize > nums.length) {
            return avgs;
        }
        long[] prefix = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        for (int i = k; i < (nums.length - k); i++) {
            int left = i - k, right = i + k;
            long sum = prefix[right + 1] - prefix[left];
            int avg = (int)(sum/windowSize);
            avgs[i] = avg;
        }
        return avgs;
        */
        /* O(n^2) intuitive solution
        int[] avgs = new int[nums.length];
        long total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i - k < 0 || i + k >= nums.length) {
                avgs[i] = -1;
            } else {
                total = 0;
                for (int j = i - k; j <= i + k; j++) {
                    total += nums[j];
                }
                avgs[i] = (int)(total/(2 * k + 1));
            }
        }
        return avgs;
        */
    }
}

// https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4836/