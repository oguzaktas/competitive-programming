class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        findAllPermutations(result, S, 0);
        return result;
    }
    
    public void findAllPermutations(List<String> result, String word, int start) {
        result.add(word);
        for (int i = start; i < word.length(); i++) {
            char[] wordArray = word.toCharArray();
            if(Character.isLetter(word.charAt(i))) {
                if (Character.isUpperCase(word.charAt(i))) {
                    wordArray[i] = Character.toLowerCase(word.charAt(i));
                    findAllPermutations(result, String.valueOf(wordArray), i + 1);
                } else {
                    wordArray[i] = Character.toUpperCase(word.charAt(i));
                    findAllPermutations(result, String.valueOf(wordArray), i + 1);
                }
            }
        }
    }
}

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/586/week-3-february-15th-february-21st/3642/