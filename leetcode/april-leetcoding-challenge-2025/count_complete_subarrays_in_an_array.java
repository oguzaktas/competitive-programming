class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            unique.add(num);
        }
        int distinctCount = unique.size();
        int right = 0;
        for (int left = 0; left < nums.length; left++) {
            if (left > 0) {
                int num = nums[left - 1];
                map.put(num, map.get(num) - 1);
                if (map.get(num) == 0) {
                    map.remove(num);
                }
            }
            while (right < nums.length && map.size() < distinctCount) {
                int num = nums[right];
                map.put(num, map.getOrDefault(num, 0) + 1);
                right++;
            }
            if (map.size() == distinctCount) {
                result += (nums.length - right + 1);
            }
        }
        return result;
    }
}

// https://leetcode.com/problems/count-complete-subarrays-in-an-array/?envType=daily-question&envId=2025-04-24