class State {
    int node, color, steps;
    State(int node, int color, int steps) {
        this.node = node;
        this.color = color;
        this.steps = steps;
    }
}

class Solution {
    int red = 0, blue = 1;
    Map<Integer, Map<Integer, List<Integer>>> graph = new HashMap<>();

    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        graph.put(red, new HashMap<>());
        graph.put(blue, new HashMap<>());
        addToGraph(red, redEdges, n);
        addToGraph(blue, blueEdges, n);
        int[] answer = new int[n];
        Arrays.fill(answer, Integer.MAX_VALUE);
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(0, red, 0));
        queue.add(new State(0, blue, 0));
        boolean[][] seen = new boolean[n][2];
        seen[0][red] = true;
        seen[0][blue] = true;
        while (!queue.isEmpty()) {
            State state = queue.remove();
            int node = state.node, color = state.color, steps = state.steps;
            answer[node] = Math.min(answer[node], steps);
            for (int neighbor : graph.get(color).get(node)) {
                if (!seen[neighbor][1 - color]) {
                    seen[neighbor][1 - color] = true;
                    queue.add(new State(neighbor, 1 - color, steps + 1));
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (answer[i] == Integer.MAX_VALUE) {
                answer[i] = -1;
            }
        }
        return answer;
    }

    private void addToGraph(int color, int[][] edges, int n) {
        for (int i = 0; i < n; i++) {
            graph.get(color).put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1];
            graph.get(color).get(x).add(y);
        }
    }
}

// https://leetcode.com/problems/shortest-path-with-alternating-colors/