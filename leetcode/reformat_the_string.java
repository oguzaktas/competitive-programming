class Solution {
    public String reformat(String s) {

        if (s == null || s.length() <= 1) {
            return s;
        }
        List<Character> digits = new ArrayList<>(s.length());
        List<Character> chars = new ArrayList<>(s.length());

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c);
            } else {
                chars.add(c);
            }
        }

        if (digits.size() == 0 || chars.size() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        boolean digitOrChar = false;
        if (digits.size() >= chars.size()) {
            digitOrChar = true;
        }

        for (int i = 0; i < s.length(); i++) {
            if (digitOrChar) {
                if (digits.size() > 0) {
                    result.append(digits.remove(0));
                }
            } else {
                if (chars.size() > 0) {
                    result.append(chars.remove(0));
                }
            }
            digitOrChar = !digitOrChar;
        }
        return result.toString();
    }
}

// https://leetcode.com/problems/reformat-the-string/