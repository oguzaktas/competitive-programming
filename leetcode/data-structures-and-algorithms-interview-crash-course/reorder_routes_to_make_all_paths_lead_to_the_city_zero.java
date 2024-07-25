class Solution {
    Set<String> roads = new HashSet<>();
    Map<Integer, List<Integer>> graph = new HashMap<>();
    Set<Integer> seen = new HashSet<>();

    public int minReorder(int n, int[][] connections) {
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] connection : connections) {
            int x = connection[0], y = connection[1];
            graph.get(x).add(y);
            graph.get(y).add(x);
            roads.add(convertToHash(x, y));
        }
        seen.add(0);
        return dfs(0);
    }

    private int dfs(int node) {
        int answer = 0;
        for (int neighbor : graph.get(node)) {
            if (!seen.contains(neighbor)) {
                if (roads.contains(convertToHash(node, neighbor))) {
                    answer++;
                }
                seen.add(neighbor);
                answer += dfs(neighbor);
            }
        }
        return answer;
    }

    private String convertToHash(int row, int col) {
        return String.valueOf(row) + "," + String.valueOf(col);
    }
}

// https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/