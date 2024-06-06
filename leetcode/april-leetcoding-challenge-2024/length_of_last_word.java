class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length != 0) {
                break;
            }
        }
        return length;
        // return s.split(" ")[s.split(" ").length-1].length();
    }
}

// https://leetcode.com/problems/length-of-last-word/?envType=daily-question&envId=2024-04-01