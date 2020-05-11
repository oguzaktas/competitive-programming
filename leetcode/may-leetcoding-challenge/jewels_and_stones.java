class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] chars = S.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (J.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}

// https://leetcode.com/problems/jewels-and-stones/