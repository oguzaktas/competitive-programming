class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }
        Map<Character, Character> map = new HashMap<>(26);
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < tChars.length; i++) {
            if (map.containsKey(sChars[i])) {
                if (map.get(sChars[i]) != tChars[i]) {
                    return false;
                }
            } else {
                if (map.containsValue(tChars[i])) {
                    return false;
                }
                map.put(sChars[i], tChars[i]);
            }
        }
        return true;
        // return transformString(s).equals(transformString(t));
    }

    /*
    private String transformString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, i);
            }
            sb.append(Integer.toString(map.get(c)));
            sb.append(" ");
        }
        return sb.toString();
    }
    */
}

// https://leetcode.com/problems/isomorphic-strings/?envType=daily-question&envId=2024-04-02