class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
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
    }
}

// https://leetcode.com/problems/count-the-number-of-consistent-strings/

/*
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] alpha = new int[26];
        for (int i = 0; i < allowed.length(); i++) {
            char ch = allowed.charAt(i);
            alpha[ch - 'a']++;
        }
        int count = 0;
        T: for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (alpha[ch - 'a'] <= 0) {
                    continue T;
                }
            }
            count++;
        }
        return count;
    }
}
*/
