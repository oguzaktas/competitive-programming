class Solution {
    public int longestPalindrome(String s) {
        // using HashSet
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                count += 2;
            } else {
                set.add(c);
            }
        }
        return set.isEmpty() ? count : count+1;
        /* using char array O(n), 1 ms runtime
        int oddCount = 0;
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
            if (count[c] % 2 == 1) {
                oddCount++;
            } else {
                oddCount--;
            }
        }
        if (oddCount == 0) {
            return s.length();
        }
        return s.length() - oddCount + 1;
        */
        /* using HashMap O(n), 7 ms runtime
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int result = 0;
        boolean hasOdd = false;
        for (char c : map.keySet()) {
            if (map.get(c) % 2 == 0) {
                result += map.get(c);
            } else {
                result += map.get(c) - 1;
                hasOdd = true;
            }
        }
        if (hasOdd) {
            return result+1;
        }
        return result;
        */
    }
}

// https://leetcode.com/problems/longest-palindrome/?envType=daily-question&envId=2024-06-04