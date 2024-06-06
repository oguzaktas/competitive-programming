class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        int left = 0, result = 0;
        for (int right = 0; right < s.length(); right++) {
            counts.put(s.charAt(right), counts.getOrDefault(s.charAt(right), 0) + 1);
            while (counts.size() > 2) {
                char remove = s.charAt(left);
                counts.put(remove, counts.getOrDefault(remove, 0) - 1);
                if (counts.get(remove) == 0) {
                    counts.remove(remove);
                }
                left++;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}

// https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/