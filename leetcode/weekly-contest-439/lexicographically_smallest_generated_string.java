class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int L = n + m - 1;
        char[] word = new char[L];
        boolean[] forced = new boolean[L];

        // assign all free positions the letter 'a'
        for (int i = 0; i < L; i++) {
            word[i] = 'a';
            forced[i] = false;
        }

        // step 1: apply T constraints
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    int pos = i + j;
                    char required = str2.charAt(j);
                    if (forced[pos] && word[pos] != required) {
                        return "";
                    }
                    word[pos] = required;
                    forced[pos] = true;
                }
            }
        }

        // step 2: process F constraints
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'F') {
                boolean equals = true;
                // check if the substring word[i...i+m-1] equals str2
                for (int j = 0; j < m; j++) {
                    if (word[i + j] != str2.charAt(j)) {
                        equals = false;
                        break;
                    }
                }
                if (equals) {
                    boolean fixed = false;
                    for (int j = m - 1; j >= 0; j--) {
                        int pos = i + j;
                        if (!forced[pos]) {
                            char current = word[pos];
                            for (char cand = (char)(current + 1); cand <= 'z'; cand++) {
                                if (cand != str2.charAt(j)) {
                                    word[pos] = cand;
                                    fixed = true;
                                    break;
                                }
                            }
                            if (fixed) break;
                        }
                    }
                    if (!fixed) {
                        return "";
                    }
                }
            }
        }

        return new String(word);
    }
}

// https://leetcode.com/contest/weekly-contest-439/problems/lexicographically-smallest-generated-string/