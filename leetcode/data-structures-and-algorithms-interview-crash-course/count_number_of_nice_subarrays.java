class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int result = 0, count = 0;
        int[] prefix = new int[nums.length + 1];
        prefix[0] = 1;
        for (int num : nums) {
            count += num % 2;
            if (count >= k) {
                result += prefix[count - k];
            }
            prefix[count]++;
        }
        return result;
        /*
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);
        int current = 0, answer = 0;
        for (int i = 0; i < nums.length; i++) {
            current += nums[i] % 2;
            answer += counts.getOrDefault(current - k, 0);
            counts.put(current, counts.getOrDefault(current, 0) + 1);
        }
        return answer;
        */
    }
}

// https://leetcode.com/problems/count-number-of-nice-subarrays/