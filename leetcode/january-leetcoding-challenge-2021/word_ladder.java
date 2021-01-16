

/* Initial intuitive solution
public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    int count = 0, diff;
    String compareWord = beginWord;
    for (int i = 0; i < wordList.size(); i++) {
        diff = 0;
        for (int j = 0; j < compareWord.length(); j++) {
            if (wordList.get(i).charAt(j) != compareWord.charAt(j)) {
                diff++;
            }
        }
        if (diff <= 1) {
            count++;
        }
        compareWord = wordList.get(i);
        if (wordList.get(i).equals(endWord)) {
            return count;
        }
    }
    return 0;
}
*/