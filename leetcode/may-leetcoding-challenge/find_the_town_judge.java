class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] trustCount = new int[N + 1];
        
        for (int[] pair : trust) {
            trustCount[pair[0]]--;
            trustCount[pair[1]]++;
        }
        
        for (int i = 1; i < trustCount.length; i++) {
            if (trustCount[i] == N - 1) {
                return i;
            }
        }
        
        return -1; 
    }
}

// https://leetcode.com/problems/find-the-town-judge/
