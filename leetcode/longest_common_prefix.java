class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            length = Math.min(length, strs[i].length());
            for (int j = 0; j < length; j++) {
                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    length = j;
                    break;
                }
            }
        }
        return strs[0].substring(0, length);
    }
}

// https://leetcode.com/problems/longest-common-prefix/