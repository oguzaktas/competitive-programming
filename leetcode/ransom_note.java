class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) <= 0) {
                    return false;
                } else {
                    map.put(c, map.get(c) - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}

// https://leetcode.com/problems/ransom-note/

/* Simple Java solution
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[]r = new char[26];
        char[]m = new char[26];
        for(char c: ransomNote.toCharArray())
            r[c-'a']++;
        for(char c: magazine.toCharArray())
            m[c-'a']++;
        for(char c: ransomNote.toCharArray()){
            if(r[c-'a'] > m[c-'a'])
                return false;
        }
        return true;
    }
}
*/