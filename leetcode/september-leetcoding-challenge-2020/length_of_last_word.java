class Solution {
    public int lengthOfLastWord(String s) {
        String[] splitted = s.split(" ");
        if (splitted.length == 0) {
            return 0;
        }
        return splitted[splitted.length - 1].length();
    }
}

// https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/556/week-3-september-15th-september-21st/3461/