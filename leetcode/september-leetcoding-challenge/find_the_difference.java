class Solution {
    public char findTheDifference(String s, String t) {
        int mask = t.charAt(s.length());
        for (int i = 0; i < s.length(); i++) {
            mask -= s.charAt(i);
            mask += t.charAt(i);
        }
        return (char) mask;
    }
}

// https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/557/week-4-september-22nd-september-28th/3471/