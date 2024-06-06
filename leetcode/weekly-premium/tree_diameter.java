class Solution {
    private List<List<Integer>> graph;
    private int diameter = 0;
    public int treeDiameter(int[][] edges) {
        if (edges == null || edges.length == 0) {
            return 0;
        }
        this.graph = new ArrayList<List<Integer>>();
        boolean[] visited = new boolean[edges.length + 1];
        for (int i = 0; i < edges.length + 1; i++) {
            this.graph.add(new ArrayList<Integer>());
            visited[i] = false;
        }
        for (int[] e : edges) {
            int u = e[0], v = e[1];
            this.graph.get(u).add(v);
            this.graph.get(v).add(u);
        }
        dfs(0, visited);
        return diameter;
    }

    private int dfs(int current, boolean[] visited) {
        int dist1 = 0, dist2 = 0;
        visited[current] = true;
        for (int n : graph.get(current)) {
            int distance = 0;
            if (!visited[n]) {
                distance = 1 + dfs(n, visited);
            }
            if (distance > dist1) {
                dist2 = dist1;
                dist1 = distance;
            } else if (distance > dist2) {
                dist2 = distance;
            }
        }
        diameter = Math.max(diameter, dist1 + dist2);
        return dist1;
    }
}

// https://leetcode.com/problems/tree-diameter/