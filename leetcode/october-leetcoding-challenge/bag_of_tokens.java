class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        if (tokens.length == 0 || P < tokens[0]) {
            return 0;
        }
        int left = 0, right = tokens.length - 1, score = 0;
        while (left <= right) {
            if (P >= tokens[left]) {
                score++;
                P -= tokens[left];
                left++;
            } else {
                if (right - left > 1) {
                    P += tokens[right];
                    right--;
                    score--;
                } else
                    break;
            }
        }
        return score;
    }
}

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/562/week-4-october-22nd-october-28th/3506/