class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            frequency.put(s.charAt(i), frequency.getOrDefault(s.charAt(i), 0) + 1);
        }
        return new HashSet(frequency.values()).size() == 1;
        /*
        int[] answer = new int[frequency.size()];
        int c = 0;
        for (Map.Entry e : frequency.entrySet()) {
            answer[c] = (int)e.getValue();
            c++;
        }
        for (int i = 0; i < answer.length - 1; i++) {
            if (answer[i] != answer[i+1]) {
                return false;
            }
        }
        return true;
        */
    }
}

// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/