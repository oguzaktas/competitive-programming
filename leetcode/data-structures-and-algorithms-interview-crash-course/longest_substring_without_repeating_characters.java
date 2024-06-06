class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        int[] index = new int[128];
        for (int i = 0, j = 0; j < s.length(); j++) {
            i = Math.max(index[s.charAt(j)], i);
            answer = Math.max(answer, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return answer;
        /* using HashMap
        int result = 0, left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)), left);
            }
            result = Math.max(result, right - left + 1);
            map.put(s.charAt(right), right + 1);
        }
        return result;
        */
        /* using HashSet
        Set<Character> set = new HashSet<>();
        int result = 0, i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                result = Math.max(result, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return result;
        */
        /* using HashMap and sliding window
        int left = 0, right = 0;
        Map<Character, Integer> chars = new HashMap<>();
        int result = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            chars.put(c, chars.getOrDefault(c, 0) + 1);
            while (chars.get(c) > 1) {
                chars.put(c, chars.get(s.charAt(left)) - 1);
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
        */
    }
}

// https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4690/