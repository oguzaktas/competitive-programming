class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return (x == reverse) || (x == reverse / 10);
        /* Old solution 6 ms runtime
        if (x == 0) {
            return true;
        } else if (x < 0 || x % 10 == 0) {
            return false;
        }
        
        int reversed = 0;
        while (x > reversed) {
            int pop = x % 10;
            x /= 10;
            reversed = (reversed * 10) + pop;
        }
        if (x == reversed) {
            return true;
        } else
            return x == reversed / 10;
        */
    }
}

// https://leetcode.com/problems/palindrome-number/