class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> increasing = new ArrayDeque<>();
        Deque<Integer> decreasing = new ArrayDeque<>();
        int left = 0, answer = 0;
        for (int right = 0; right < nums.length; right++) {
            while (!increasing.isEmpty() && increasing.getLast() > nums[right]) {
                increasing.removeLast();
            }
            while (!decreasing.isEmpty() && decreasing.getLast() < nums[right]) {
                decreasing.removeLast();
            }
            increasing.addLast(nums[right]);
            decreasing.addLast(nums[right]);
            while (decreasing.getFirst() - increasing.getFirst() > limit) {
                if (nums[left] == decreasing.getFirst()) {
                    decreasing.removeFirst();
                }
                if (nums[left] == increasing.getFirst()) {
                    increasing.removeFirst();
                }
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }
        return answer;
    }
}

// https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/