class Solution {
    public boolean backspaceCompare(String s, String t) {
        // return build(s).equals(build(t));
        int i = s.length() - 1, j = t.length() - 1;
        int skipS = 0, skipT = 0;
        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if ()
            }
        }
    }

    private String build(String str) {
        // Stack<Character> stack = new Stack<>();
        StringBuilder stack = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                // stack.push(c);
                stack.append(c);
            // } else if (!stack.empty()) {
            } else if (!stack.isEmpty()) {
                // stack.pop();
                stack.deleteCharAt(stack.length() - 1);
            }
        }
        // return String.valueOf(stack);
        return stack.toString();
    }
}

// https://leetcode.com/problems/backspace-string-compare/