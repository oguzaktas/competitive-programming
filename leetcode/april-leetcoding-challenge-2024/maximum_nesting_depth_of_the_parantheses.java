class Solution {
    public int maxDepth(String s) {
        int answer = 0, openBrackets = 0;
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                openBrackets++;
            } else if (c == ')') {
                openBrackets--;
            }
            answer = Math.max(answer, openBrackets);
        }
        return answer;
    }
}

// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/?envType=daily-question&envId=2024-04-04