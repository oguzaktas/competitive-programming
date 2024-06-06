class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chars = new int[26];
        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c, chars[(int) c % 26]);
            if (index == -1) {
                return false;
            }
            chars[(int) c % 26] = index + 1;
        }
        return true;
        /*
        Map<Character, Integer> map = new HashMap<>();
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map.containsKey(ransomNote.charAt(i))) {
                if (map.get(ransomNote.charAt(i)) <= 0) {
                    return false;
                } else {
                    map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }
        return true;
        */
    }
}

// https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4607/