class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output;
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList());
            }
            ans.get(key).add(s);
        }
        output = new ArrayList(ans.values());
        return output;
    }
}

// https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3288/

/* Solution: Approach 1: Categorize by Sorted String
Complexity analysis -> Time complexity: O(nklogk), where n is the length of strs, and k is the maximum length of a string in strs.
Space complexity: O(nk), the total information content stored in ans.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
*/

/* Approach 2: Categorize by Count -> Two strings are anagrams if and only if their character counts (respective number of occurrences of each character) are the same.
Complexity analysis -> Time complexity: O(nk), space complexity: O(nk)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
*/