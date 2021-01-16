class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }
        for (int j = 0; j < word2.length; j++) {
            sb2.append(word2[j]);
        }
        System.out.println(sb1);
        System.out.println(sb2);
        return sb1.toString().equals(sb2.toString()) ? true : false;
    }
}

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/580/week-2-january-8th-january-14th/3597/