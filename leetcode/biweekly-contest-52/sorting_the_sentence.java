class Solution {
    public String sortSentence(String s) {
        Map<Integer, String> map = new HashMap<>();
        String[] splitStr = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < splitStr.length; i++) {
            map.put(Character.getNumericValue(splitStr[i].charAt(splitStr[i].length() - 1)), splitStr[i].substring(0, splitStr[i].length() - 1));
        }
        Map<Integer, String> treeMap = new TreeMap<>(map);
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            result.append(entry.getValue() + " ");
        }
        return result.toString().trim();
    }
}

// https://leetcode.com/contest/biweekly-contest-52/problems/sorting-the-sentence/