class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] splitted = sentence.split(" ");
        for (int i = 0; i < splitted.length; i++) {
            for (int j = 0; j < dictionary.size(); j++) {
                if (splitted[i].startsWith(dictionary.get(j))) {
                    splitted[i] = dictionary.get(j);
                }
            }
        }
        return Arrays.toString(splitted).replace(",", "").replace("[", "").replace("]", "");
    }
}

// https://leetcode.com/problems/replace-words/?envType=daily-question&envId=2024-06-07