class Solution {
    public String removeKdigits(String num, int k) {
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : num.toCharArray()) {
            while (stack.size() > 0 && k > 0 && stack.getLast() > c) {
                stack.pollLast();
                k--;
            }
            stack.add(c);
        }
        for (int i = 0; i < k; i++) {
            stack.pollLast();
        }
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (char c : stack) {
            if (leadingZero && c == '0') {
                continue;
            }
            leadingZero = false;
            sb.append(c);
        }
        if (sb.length() == 0) {
            return "0";
        }
        return sb.toString();
    }
}

// https://leetcode.com/problems/remove-k-digits/?envType=daily-question&envId=2024-04-11