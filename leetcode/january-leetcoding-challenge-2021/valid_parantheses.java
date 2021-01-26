class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

/* JS solution;
/**
 * @param {string} s
 * @return {boolean}
 */
/*
var isValid = function(s) {
    const b = {
        ')' : '(',
        ']' : '[',
        '}' : '{'
    };
    const a = [];
    for (let i = 0; i < s.length; i++) {
        if (b[s[i]] == undefined) {
            a.push(s[i]);
        } else {
            const last = a.pop();
            if (b[s[i]] !== last) {
                return false;
            }
        }
    }
    return (a.length === 0);
};
*/

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/581/week-3-january-15th-january-21st/3610/