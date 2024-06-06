class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPalindrome(words, i, j)) {
                    result.add(Arrays.asList(i, j));
                }
                if (isPalindrome(words, j, i)) {
                    result.add(Arrays.asList(j, i));
                }
            }
        }
        return result;
    }
    
    public boolean isPalindrome(String[] words, int i, int j) {
        int m = 0;
        int n = words[j].length() - 1;
        while (m < words[i].length() && n >= 0) {
            if (words[i].charAt(m) != words[j].charAt(n)) {
                return false;
            }
            m++;
            n--;
        }
        int m2 = words[i].length() - 1;
        while (m < m2) {
            if (words[i].charAt(m) != words[i].charAt(m2)) {
                return false;
            }
            m++;
            m2--;
        }
        int n2 = 0;
        while (n > n2) {
            if (words[j].charAt(n) != words[j].charAt(n2)) {
                return false;
            }
            n--;
            n2++;
        }
        return true;
    }
}

// https://leetcode.com/problems/palindrome-pairs/?envType=daily-question&envId=2021-06-13