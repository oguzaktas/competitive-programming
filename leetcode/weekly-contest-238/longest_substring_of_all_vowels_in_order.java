class Solution {
    public int longestBeautifulSubstring(String word) {
        int longest = 0;
        Set<Character> seen = new HashSet<>();
        for (int low = -1, high = 0; high < word.length(); high++) {
            if (high > 0 && word.charAt(high - 1) > word.charAt(high)) {
                seen = new HashSet<>();
                low = high - 1;
            }
            seen.add(word.charAt(high));
            if (seen.size() == 5) {
                longest = Math.max(longest, high - low);
            }
        }
        return longest;
    }
}

// https://leetcode.com/contest/weekly-contest-238/problems/longest-substring-of-all-vowels-in-order/

/* Initial solution (Time Limit Exceeded)
class Solution {
    public int longestBeautifulSubstring(String word) {
        int result = 0;
        if (word.length() == 1) {
            return 0;
        }
        for (int k = 0; k < word.length() - 2;) {
            int j = k + 2;
            while (isAlphabeticOrder(word.substring(k, j))) {
                if (hasAllVowels(word.substring(k, j))) {
                    result = result > word.substring(k, j).length() ? result : word.substring(k, j).length();
                }
                j++;
                if (j == word.length() + 1) {
                    break;
                }
            }
            k = j - 1;
        }
        return result;
    }
    
    public boolean isAlphabeticOrder(String s) {
        char[] c = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
        }
        Arrays.sort(c);
        for (int i = 0; i < s.length(); i++) {
            if (c[i] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean hasAllVowels(String input) {
        boolean hasA = false;
        boolean hasE = false;
        boolean hasI = false;
        boolean hasO = false;
        boolean hasU = false;
        
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
            case 'a':
                hasA = true;
                break;
            case 'e':
                hasE = true;
                break;
            case 'i':
                hasI = true;
                break;
            case 'o':
                hasO = true;
                break;
            case 'u':
                hasU = true;
                break;
            default:
                continue;
            }

            if (hasA && hasE && hasI && hasO && hasU) {
                return true;
            }
        }
        return false;
    }
}
*/