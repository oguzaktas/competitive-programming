class Solution {
    public int maxNumberOfBalloons(String text) {
        int bCount = 0, aCount = 0, lCount = 0, oCount = 0, nCount = 0;
        for (char c : text.toCharArray()) {
            if (c == 'b') {
                bCount++;
            } else if (c == 'a') {
                aCount++;
            } else if (c == 'l') {
                lCount++;
            } else if (c == 'o') {
                oCount++;
            } else if (c == 'n') {
                nCount++;
            }
        }
        lCount /= 2;
        oCount /= 2;
        return Math.min(bCount, Math.min(aCount, Math.min(lCount, Math.min(oCount, nCount))));
    }
}

// https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4663/