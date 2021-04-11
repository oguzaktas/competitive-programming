class Solution {
    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) 
                return false;

            ++start;
            --end;
        }

        return true;
    }

    public int countSubstrings(String s) {
        int ans = 0;

        for (int start = 0; start < s.length(); ++start)
            for (int end = start; end < s.length(); ++end) 
                ans += isPalindrome(s, start, end) ? 1 : 0;

        return ans;
    }
}

// https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/591/week-4-march-22nd-march-28th/3686/