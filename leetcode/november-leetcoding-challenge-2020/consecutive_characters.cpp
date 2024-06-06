class Solution {
public:
    int maxPower(string s) {
        if (s.length() == 1) {
            return 1;
        }
        if (s.length() == 2) {
            if (s[0] != s[1]) {
                return 1;
            } else {
                return 2;
            }
        }
        int power[s.size()];
        power[0] = 1;
        for (int i = 1; i < s.size(); i++) {
            if (s[i] == s[i - 1]) {
                power[i] = power[i - 1] + 1;
            } else {
                power[i] = 1;
            }
        }
        return *max_element(power, power + s.size());
    }
};

// https://leetcode.com/explore/challenge/card/november-leetcoding-challenge/564/week-1-november-1st-november-7th/3518/