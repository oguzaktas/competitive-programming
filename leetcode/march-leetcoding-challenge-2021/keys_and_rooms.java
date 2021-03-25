class Solution {
    boolean[] visited;
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];
        visited[0] = true;
        dfs(rooms, 0);
        for (boolean b : visited) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
    
    public void dfs(List<List<Integer>> rooms, int idx) {
        for (int i : rooms.get(idx)) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(rooms, i);
            }
        }
    }
}

// https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/590/week-3-march-15th-march-21st/3677/