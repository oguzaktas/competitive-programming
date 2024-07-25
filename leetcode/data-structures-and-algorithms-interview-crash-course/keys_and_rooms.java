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
        /*
        Set<Integer> seen = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        seen.add(0);
        stack.push(0);
        while (!stack.empty()) {
            int node = stack.pop();
            for (int neighbor: rooms.get(node)) {
                if (!seen.contains(neighbor)) {
                    seen.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }
        return seen.size() == rooms.size();
        */
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

// https://leetcode.com/problems/keys-and-rooms/