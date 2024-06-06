class Solution {
    public long countSubarrays(int[] nums, int k) {
        long answer = 0;
        int max = 0, count = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == max) {
                count++;
            }
            while (count >= k) {
                answer += nums.length - right;
                if (nums[left] == max) {
                    count--;
                }
                left++;
            }
        }
        return answer;
        /*
        int max = Arrays.stream(nums).max().getAsInt();
        long answer = 0;
        int start = 0, maxElementsInWindow = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == max) {
                maxElementsInWindow++;
            }
            while (k == maxElementsInWindow) {
                if (nums[start] == max) {
                    maxElementsInWindow--;
                }
                start++;
            }
            answer += start;
        }
        return answer;
        */
        /*
        int max = Arrays.stream(nums).max().getAsInt();
        long answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                list.add(i);
            }
            int frequency = list.size();
            if (frequency >= k) {
                answer += list.get(frequency - k) + 1;
            }
        }
        return answer;
        */
    }
}

// https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/?envType=daily-question&envId=2024-03-29