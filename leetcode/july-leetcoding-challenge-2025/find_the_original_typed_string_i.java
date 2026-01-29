class Solution {
    public int possibleStringCount(String word) {
        int answer = 1;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i - 1) == word.charAt(i)) {
                answer++;
            }
        }
        return answer;
    }
}

// https://leetcode.com/problems/find-the-original-typed-string-i/?envType=daily-question&envId=2025-07-01