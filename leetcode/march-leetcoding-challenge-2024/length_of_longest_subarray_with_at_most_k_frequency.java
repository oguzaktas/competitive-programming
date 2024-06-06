class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int[] frequencies = new int[max - min + 1];
        int left = 0, maxWindow = 0;
        for (int right = 0; right < nums.length; right++) {
            frequencies[nums[right] - min]++;
            while (frequencies[nums[right] - min] > k) {
                frequencies[nums[left] - min]--;
                left++;
            }
            maxWindow = Math.max(maxWindow, right - left + 1);
        }
        return maxWindow;
        /*
        Map<Integer, Integer> frequency = new HashMap<>();
        int start = 0;
        int charsWithFreqOverK = 0;
        for (int end = 0; end < nums.length; end++) {
            frequency.put(nums[end], frequency.getOrDefault(nums[end], 0) + 1);
            if (frequency.get(nums[end]) == k + 1) {
                charsWithFreqOverK++;
            }
            if (charsWithFreqOverK > 0) {
                frequency.put(nums[start], frequency.get(nums[start]) - 1);
                if (frequency.get(nums[start]) == k) {
                    charsWithFreqOverK--;
                }
                start++;
            }
        }
        return nums.length - start;
        */
    }
}

// https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/?envType=daily-question&envId=2024-03-28