class Solution {
    public String longestSubsequenceRepeatedK(String s, int k) {
        int[] frequency = new int[26];
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        List<Character> list = new ArrayList<>();
        for (int i = 25; i >= 0; i--) {
            if (frequency[i] >= k) {
                list.add((char) ('a' + i));
            }
        }

        Queue<String> queue = new LinkedList<>();
        for (char c : list) {
            queue.add(String.valueOf(c));
        }
        String answer = "";
        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (current.length() > answer.length()) {
                answer = current;
            }
            for (char c : list) {
                String next = current + c;
                if (isKRepeatedSubsequence(s, next, k)) {
                    queue.add(next);
                }
            }
        }
        return answer;
    }

    private boolean isKRepeatedSubsequence(String s, String t, int k) {
        int position = 0, matched = 0;
        int m = t.length();
        for (char c : s.toCharArray()) {
            if (c == t.charAt(position)) {
                position++;
                if (position == m) {
                    position = 0;
                    matched++;
                    if (matched == k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

// https://leetcode.com/problems/longest-subsequence-repeated-k-times/?envType=daily-question&envId=2025-06-27