class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack();
        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.empty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/587/week-4-february-22nd-february-28th/3653/