class Solution {
    public int scoreOfParentheses(String S) {
        int ans = 0, bal = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                bal++;
            } else {
                bal--;
                if (S.charAt(i - 1) == '(') {
                    ans += 1 << bal;
                }
            }
        }
        return ans;
    }
}

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/587/week-4-february-22nd-february-28th/3651/