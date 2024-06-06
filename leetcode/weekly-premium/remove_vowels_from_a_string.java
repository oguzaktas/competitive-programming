class Solution {
    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!isVowel(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
        // return s.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

// https://leetcode.com/problems/remove-vowels-from-a-string/