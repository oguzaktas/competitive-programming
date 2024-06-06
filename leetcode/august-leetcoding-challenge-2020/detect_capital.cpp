class Solution {
public:
    bool detectCapitalUse(string word) {
        int count = 0;
        int location;
        for (int i = 0; i < word.length(); i++) {
            if (word[i] >= 'A' && word[i] <= 'Z') {
                count++;
                location = i;
            }
        }
        if (count == word.length() || count == 0 || (count == 1 && location == 0)) {
            return true;
        }
        return false;
    }
};

// https://leetcode.com/problems/detect-capital/solution/