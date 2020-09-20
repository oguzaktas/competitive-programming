class Solution {
public:
    string getHint(string secret, string guess) {
        int i, n = secret.length();
        int freq[10] = {0};
        
        int bulls = 0, cows = 0;
        for (i = 0; i < n; i++) {
            if (guess[i] == secret[i]) {
                bulls++; secret[i]='#';
            }
            else
                freq[guess[i] - '0']++;
        }
        
        for (i = 0; i < n; i++) {
            if (secret[i] != '#' && freq[secret[i] - '0'] > 0) {
                freq[secret[i] - '0']--;
                cows++;
            }
        }
        return to_string(bulls) + "A" + to_string(cows) + "B";
    }
};

// https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/555/week-2-september-8th-september-14th/3455/