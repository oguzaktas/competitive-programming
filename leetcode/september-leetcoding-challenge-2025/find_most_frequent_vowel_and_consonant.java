class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int vowel = 0, consonant = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel = Math.max(vowel, map.getOrDefault(c, 0));
            } else {
                consonant = Math.max(consonant, map.getOrDefault(c, 0));
            }
        }
        return vowel + consonant;
    }
}

// https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/?envType=daily-question&envId=2025-09-13