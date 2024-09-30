class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // boolean array O(m + n.k) solution
        boolean[] isAllowed = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            isAllowed[allowed.charAt(i) - 'a'] = true;
        }
        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (int i = 0; i < word.length(); i++) {
                if (!isAllowed[word.charAt(i) - 'a']) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }
        return count;
        /* brute force O(m.n.k) solution
        int count = 0;
        boolean contains;
        for (int i = 0; i < words.length; i++) {
            contains = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!allowed.contains(Character.toString(words[i].charAt(j)))) {
                    contains = false;
                    break;
                }
            }
            if (contains) {
                count++;
            }
        }
        return count;
        */
    }
}

// https://leetcode.com/problems/count-the-number-of-consistent-strings/?envType=daily-question&envId=2024-09-12