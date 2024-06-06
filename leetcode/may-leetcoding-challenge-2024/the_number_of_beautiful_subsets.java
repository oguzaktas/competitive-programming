class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        Arrays.sort(nums);
        return countBeautifulSubsets(nums, k, freqMap, 0) - 1;
    }

    private int countBeautifulSubsets(int[] nums, int diff, Map<Integer, Integer> freqMap, int i) {
        if (i == nums.length) {
            return 1;
        }
        int totalCount = countBeautifulSubsets(nums, diff, freqMap, i + 1);
        if (!freqMap.containsKey(nums[i] - diff)) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
            totalCount += countBeautifulSubsets(nums, diff, freqMap, i + 1);
            freqMap.put(nums[i], freqMap.get(nums[i]) - 1);
            if (freqMap.get(nums[i]) == 0) {
                freqMap.remove(nums[i]);
            }
        }
        return totalCount;
    }
}

// https://leetcode.com/problems/the-number-of-beautiful-subsets/?envType=daily-question&envId=2024-05-23