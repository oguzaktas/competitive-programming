class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            char peek = sb.length() > 0 ? sb.charAt(sb.length() - 1) : '1';
            if (Math.abs(peek - c) == 32 && sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
        /*
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.empty() && Math.abs(stack.peek() - c) == 32) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
        */
        /*
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.empty() && c != stack.peek() && Character.toUpperCase(c) == Character.toUpperCase(stack.peek())) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }
        return sb.toString();
        */
    }
}

// https://leetcode.com/problems/make-the-string-great/?envType=daily-question&envId=2024-04-05