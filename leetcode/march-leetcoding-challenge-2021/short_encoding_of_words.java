class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        for (String word : words) {
            if (set.contains(word)) {
                for (int i = 1; i < word.length(); i++) {
                    set.remove(word.substring(i));
                }
            }
        }
        int result = 0;
        result = set.stream().map((word) -> word.length()).reduce(result, Integer::sum);
        return result + set.size();
    }
}

// https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3662/