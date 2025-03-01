class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String doubledString = s + s;
        return doubledString.contains(goal);
    }
}

// https://leetcode.com/problems/rotate-string/?envType=daily-question&envId=2024-11-03