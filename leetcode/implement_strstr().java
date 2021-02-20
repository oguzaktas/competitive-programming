class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (haystack.isEmpty() || needle.length() > haystack.length()) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        int i = 0;
        while (i <= haystack.length() - needle.length()) {
            if (needle.charAt(0) == haystack.charAt(i)) {
                if (checkIfSubstring(haystack, needle, i)) {
                    return i;
                } 
            }
            i++;
        }
        return -1;
    }
    
    public boolean checkIfSubstring(String haystack, String needle, int index) {
        int currIndex = 0;
        while (currIndex < needle.length()) {
            if (needle.charAt(currIndex++) != haystack.charAt(index++)) {
                return false;
            }
        }
        return true;
    }
}

// https://leetcode.com/problems/implement-strstr/