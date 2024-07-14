class Solution {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    boolean[] seen;
    public int findCircleNum(int[][] isConnected) {
        for (int i = 0; i < isConnected.length; i++) {
            if (!graph.containsKey(i)) {
                graph.put(i, new ArrayList<>());
            }
            for (int j = i + 1; j < isConnected.length; j++) {
                if (!graph.containsKey(j)) {
                    graph.put(j, new ArrayList<>());
                }
                if (isConnected[i][j] == 1) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        seen = new boolean[isConnected.length];
        int answer = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!seen[i]) {
                answer++;
                seen[i] = true;
                dfs(i);
            }
        }
        return answer;
    }

    private void dfs(int node) {
        for (int neighbor : graph.get(node)) {
            if (!seen[neighbor]) {
                seen[neighbor] = true;
                dfs(neighbor);
            }
        }
    }
}

// https://leetcode.com/problems/number-of-provinces/