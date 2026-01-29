class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            set.add(c);
        }
        int result = 0;
        boolean canType = true;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                if (canType) {
                    result++;
                }
                canType = true;
            } else if (set.contains(c)) {
                canType = false;
            }
        }
        if (canType) {
            result++;
        }
        return result;
    }
}

// https://leetcode.com/problems/maximum-number-of-words-you-can-type/?envType=daily-question&envId=2025-09-15