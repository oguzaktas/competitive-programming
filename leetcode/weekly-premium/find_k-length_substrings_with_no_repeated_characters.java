class Solution {
    public int numKLenSubstrNoRepeats(String s, int k) {
        if (s.length() < k || k > 26) {
            return 0;
        }
        // frequency array for characters
        int[] freq = new int[128];
        int left = 0, distinctCount = 0, validCount = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (freq[c] == 0) {
                distinctCount++;
            }
            freq[c]++;

            // maintain window of size k
            if (right - left + 1 > k) {
                char leftChar = s.charAt(left);
                freq[leftChar]--;
                if (freq[leftChar] == 0) {
                    distinctCount--;
                }
                left++;
            }

            if (right - left + 1 == k) {
                // if distinct count equals window size, all characters are unique
                if (distinctCount == k) {
                    validCount++;
                }
            }
        }
        return validCount;
    }
}

// https://leetcode.com/problems/find-k-length-substrings-with-no-repeated-characters/