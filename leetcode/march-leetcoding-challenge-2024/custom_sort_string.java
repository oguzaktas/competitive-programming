class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            while (map.getOrDefault(c, 0) > 0) {
                sb.append(c);
                map.put(c, map.get(c) - 1);
            }
        }
        for (char c : map.keySet()) {
            int count = map.get(c);
            while (count > 0) {
                sb.append(c);
                count--;
            }
        }
        return sb.toString();
    }
}

// https://leetcode.com/problems/custom-sort-string/?envType=daily-question&envId=2024-03-11