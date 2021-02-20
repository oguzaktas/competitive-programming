class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                matches += n / 2;
                n /= 2;
            } else {
                if (n == 1) {
                    break;
                }
                matches += (n - 1) / 2;
                n = n / 2 + 1;
            }
        }
        return matches;
    }
}

// https://leetcode.com/problems/count-of-matches-in-tournament/