class Solution {
    public boolean verifyPreorder(int[] preorder) {
        if (preorder == null || preorder.length <= 1) {
            return true;
        }
        int min = Integer.MIN_VALUE, index = -1;
        for (int i = 0; i < preorder.length; i++) {
            if (preorder[i] <= min) {
                return false;
            }
            while (index >= 0 && preorder[index] < preorder[i]) {
                int value = preorder[index--];
                min = Math.max(min, value);
            }
            preorder[++index] = preorder[i];
        }
        return true;
        /*
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MIN_VALUE;
        for (int i = 0; i < preorder.length; i++) {
            if (preorder[i] < root) {
                return false;
            }
            while (!stack.empty() && stack.peek() < preorder[i]) {
                root = stack.pop();
            }
            stack.push(preorder[i]);
        }
        return true;
        */
    }
}

// https://leetcode.com/problems/verify-preorder-sequence-in-binary-search-tree/