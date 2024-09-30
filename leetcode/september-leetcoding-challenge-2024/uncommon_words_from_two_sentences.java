class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : s1.split(" ")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : s2.split(" ")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> answer = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                answer.add(s);
            }
        }
        return answer.toArray(new String[answer.size()]);
    }
}

// https://leetcode.com/problems/uncommon-words-from-two-sentences/?envType=daily-question&envId=2024-09-17