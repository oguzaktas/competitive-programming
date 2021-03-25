class Solution {
    public boolean hasAllCodes(String s, int k) {
        int need = 1 << k;
        Set<String> set = new HashSet<>();
        for (int i = k; i <= s.length(); i++) {
            String a = s.substring(i - k, i);
            if (!set.contains(a)) {
                set.add(a);
                need--;
                if (need == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}

// https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3669/