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
        int[] freq = new int[26];
        for (int i = 0; i < allowed.length(); i++) {
            freq[allowed.charAt(i) - 'a']++;
        }
        int count = 0;
        boolean isAllowed = true;
        for (int i = 0; i < words.length; i++) {
            isAllowed = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (freq[words[i].charAt(j) - 'a'] == 0) {
                    isAllowed = false;
                    break;
                }
            }
            if (isAllowed)
                couny++;
        }
        return count;
    }
}
*/