class Solution {
    public int numSteps(String s) {
        int operations = 0, carry = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            int digit = Character.getNumericValue(s.charAt(i)) + carry;
            if (digit % 2 == 1) {
                operations += 2;
                carry = 1;
            } else {
                operations++;
            }
        }
        return operations + carry;
    }
}

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/?envType=daily-question&envId=2024-05-29