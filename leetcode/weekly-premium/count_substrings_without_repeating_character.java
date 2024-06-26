class Solution {
    public int numberOfSpecialSubstrings(String s) {
        // sliding window O(n) solution
        int substringCount = 0;
        int start = 0;
        int[] freq = new int[26];
        for (int end = 0; end < s.length(); end++) {
            freq[s.charAt(end) - 'a']++;
            while (freq[s.charAt(end) - 'a'] > 1) {
                freq[s.charAt(start) - 'a']--;
                start++;
            }
            substringCount += (end - start + 1);
        }
        return substringCount;
        /* intuitive inefficient O(n^2) solution using HashSet
        Set<Character> set;
        int count = s.length();
        for (int i = 0; i < s.length() - 1; i++) {
            set = new HashSet<>();
            set.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                } else {
                    set.add(s.charAt(j));
                    count++;
                }
            }
        }
        return count;
        */
    }
}

// https://leetcode.com/problems/count-substrings-without-repeating-character/