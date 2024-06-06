class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        if (tokens.length == 0 || power < tokens[0]) {
            return 0;
        }
        int left = 0, right = tokens.length-1, score = 0;
        while (left <= right) {
            if (power >= tokens[left]) {
                score++;
                power -= tokens[left];
                left++;
            } else {
                if (right - left > 1) {
                    power += tokens[right];
                    right--;
                    score--;
                } else {
                    break;
                }
            }
        }
        return score;
    }
}

// https://leetcode.com/problems/bag-of-tokens/?envType=daily-question&envId=2024-03-04