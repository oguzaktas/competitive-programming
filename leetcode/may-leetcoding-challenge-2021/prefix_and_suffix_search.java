class WordFilter {
    
    Map<String, Integer> map = new HashMap<>();

    public WordFilter(String[] words) {
        for (int i = 0; i < words.length; i++){
            for (int j = 0; j <= 10 && j <= words[i].length(); j++) {
                for (int k = 0; k <= 10 && k <= words[i].length(); k++) {
                    map.put(words[i].substring(0, j) + "#" + words[i].substring(words[i].length() - k), i);
                }
            }
        }
    }
    
    public int f(String prefix, String suffix) {
        return (map.containsKey(prefix + '#' + suffix)) ? map.get(prefix + '#' + suffix) : -1;
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */

 // https://leetcode.com/explore/challenge/card/may-leetcoding-challenge-2021/598/week-1-may-1st-may-7th/3728/