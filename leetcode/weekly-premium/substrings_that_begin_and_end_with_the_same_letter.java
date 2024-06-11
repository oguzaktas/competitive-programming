class Solution {
    public long numberOfSubstrings(String s) {
        Map<Character, Long> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0l) + 1);
        }
        long result = 0;
        for (char c : map.keySet()) {
            result += map.get(c) * (map.get(c) + 1) / 2;
        }
        return result;
    }
}

// https://leetcode.com/problems/substrings-that-begin-and-end-with-the-same-letter/?envType=weekly-question&envId=2024-06-08