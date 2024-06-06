class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        int i = -1;
        for (char c : arr) {
            if (i >= 0 && c == arr[i]) {
                i--;
            } else {
                arr[++i] = c;
            }
        }
        return String.valueOf(arr, 0, i+1);
        /*
        StringBuilder sb = new StringBuilder();
        int sbLength = 0;
        for (char c : s.toCharArray()) {
            if (sbLength != 0 && c == sb.charAt(sbLength - 1)) {
                sb.deleteCharAt(sbLength-- - 1);
            } else {
                sb.append(c);
                sbLength++;
            }
        }
        return sb.toString();
        */
        /*
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.empty()) {
                stack.push(c);
            } else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        while (!stack.empty()) {
            sb.append(stack.removeFirst());
        }
        return sb.toString();
        */
    }
}

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/