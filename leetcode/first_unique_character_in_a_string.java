class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int j = 0; j < s.length(); j++) {
            if (count.get(s.charAt(j)) == 1) {
                return j;
            }
        }
        return -1;
    }
}

// https://leetcode.com/problems/first-unique-character-in-a-string/