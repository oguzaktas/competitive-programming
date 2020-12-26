class Solution {
    public List<List<String>> partition(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        List<List<String>> result = new ArrayList<List<String>>();
        dfs(result, s, 0, new ArrayList<String>(), dp);
        return result;
    }
    
    public void dfs(List<List<String>> result, String s, int start, List<String> currentList, boolean[][] dp) {
        if (start >= s.length()) {
            result.add(new ArrayList<String>(currentList));
        }
        for (int end = start; end < s.length(); end++) {
            if (s.charAt(start) == s.charAt(end) && (end - start <= 2 || dp[start + 1][end - 1])) {
                dp[start][end] = true;
                currentList.add(s.substring(start, end + 1));
                dfs(result, s, end + 1, currentList, dp);
                currentList.remove(currentList.size() - 1);
            }
        }
    }
}

// https://leetcode.com/explore/challenge/card/december-leetcoding-challenge/570/week-2-december-8th-december-14th/3565/