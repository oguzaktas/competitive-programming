class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s : operations) {
            x += (s.charAt(1) == '+') ? 1 : -1;
        }
        /*
        for (String s : operations) {
            if (s.equals("X++") || s.equals("++X")) {
                x++;
            } else {
                x--;
            }
        }
        */
        return x;
    }
}

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/?envType=daily-question&envId=2025-10-20