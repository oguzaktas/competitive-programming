class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> original = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> lower = new HashMap<>();
        Map<String, String> mask = new HashMap<>();
        for (int i = wordlist.length - 1; i >= 0; i--) {
            String word = wordlist[i], wlow = word.toLowerCase();
            lower.put(wlow, word);
            mask.put(vmask(wlow), word);
        }
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i], qlow = query.toLowerCase(), qmask = vmask(qlow);
            if (original.contains(query)) {
                continue;
            } else if (lower.containsKey(qlow)) {
                queries[i] = lower.get(qlow);
            } else if (mask.containsKey(qmask)) {
                queries[i] = mask.get(qmask);
            } else {
                queries[i] = "";
            }
        }
        return queries;
    }
    
    public String vmask(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                c = '*';
            }
            sb.append(c);
        }
        return sb.toString();
    }
}

// https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/591/week-4-march-22nd-march-28th/3681/