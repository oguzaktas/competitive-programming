class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0, numWhites = 0, numRecolors = Integer.MAX_VALUE;
        for (int right = 0; right < blocks.length(); right++) {
            if (blocks.charAt(right) == 'W') {
                numWhites++;
            }

            if (right - left + 1 == k) {
                numRecolors = Math.min(numRecolors, numWhites);
                if (blocks.charAt(left) == 'W') {
                    numWhites--;
                }
                left++;
            }
        }
        return numRecolors;
    }
}

// https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/?envType=daily-question&envId=2025-03-08