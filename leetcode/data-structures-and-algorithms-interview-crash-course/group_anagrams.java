class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> answer = new HashMap<String, List>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (!answer.containsKey(key)) {
                answer.put(key, new ArrayList());
            }
            answer.get(key).add(s);
        }
        return new ArrayList(answer.values());
    }
}

// https://leetcode.com/problems/group-anagrams/