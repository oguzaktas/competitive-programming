class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        // List<Integer> result = new ArrayList<>();
        int[] answer = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[i] > nums[deque.getLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
            if (deque.getFirst() + k == i) {
                deque.removeFirst();
            }
            if (i >= k - 1) {
                answer[i - k + 1] = nums[deque.getFirst()];
            }
        }
        return answer;
    }
}

// https://leetcode.com/problems/sliding-window-maximum/