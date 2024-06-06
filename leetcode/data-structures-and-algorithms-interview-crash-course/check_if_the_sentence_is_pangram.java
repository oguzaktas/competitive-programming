class Solution {
    public boolean checkIfPangram(String sentence) {
        char c = 'a';
        for (int i = 0; i < 26; i++) {
            if(!sentence.contains(String.valueOf(c))) {
                return false;
            }
            c++;
        }
        return true;
        /* HashSet solution
        Set<Character> seen = new HashSet<>();
        for (char currentChar : sentence.toCharArray()) {
            seen.add(currentChar);
        }
        return seen.size() == 26;
        */
        /* HashMap solution
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            map.put(sentence.charAt(i), map.getOrDefault(sentence.charAt(i), 0) + 1);
        }
        return map.size() == 26;
        */
    }
}

// https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4601/