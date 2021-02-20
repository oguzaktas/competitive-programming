class Solution {
    public int getNumber(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                break;
        }
        return -1;
    }

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = getNumber(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = getNumber(s.charAt(i + 1));
                if (s1 >= s2) {
                    result += s1;
                } else {
                    result -= s1;
                }
            } else {
                result += s1;
            }
        }
        return result;
    }
}

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/586/week-3-february-15th-february-21st/3646/

/* C++ Solution
int romanToInt(string s) {        
    map<char, int> values = {{'I', 1}, {'V', 5}, {'X', 10}, {'L', 50}, {'C', 100}, {'D', 500}, {'M', 1000}};
    int total = 0;
    for (int i = 0; i < s.length(); i++) {
        // If the current value is greater than or equal to the value of the symbol to the right
        if (values[s[i]] >= values[s[i+1]]) {
            total = total + values[s[i]]; 
        }
        // If the current value is smaller than the value of the symbol to the right
        else {
            total = total - values[s[i]];  
        }
  }
  return total;
}
*/