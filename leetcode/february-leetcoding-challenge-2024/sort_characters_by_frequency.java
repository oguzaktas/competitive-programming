class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        IntStream.range(0, s.length()).forEach(i -> map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1));
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry e = pq.remove();
            IntStream.range(0, (int) e.getValue()).forEach(i -> sb.append(e.getKey()));
        }
        return sb.toString();
    }
}

// https://leetcode.com/problems/sort-characters-by-frequency/?envType=daily-question&envId=2024-02-07