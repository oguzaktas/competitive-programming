class Solution {
    public int countComponents(int n, int[][] edges) {
        // approach 2 - dfs
        int components = 0;
        boolean[] visited = new boolean[n];
        List<Integer>[] adjList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < edges.length; i++) {
            adjList[edges[i][0]].add(edges[i][1]);
            adjList[edges[i][1]].add(edges[i][0]);
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                components++;
                dfs(adjList, visited, i);
            }
        }
        return components;
        /* approach 1
        int[] representative = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            size[i] = 1;
            representative[i] = i;
        }
        int components = n;
        for (int i = 0; i < edges.length; i++) {
            components -= combine(representative, size, edges[i][0], edges[i][1]);
        }
        return components;
        */
    }
    
    private void dfs(List<Integer>[] adjList, boolean[] visited, int startNode) {
        visited[startNode] = true;
        for (int i = 0; i < adjList[startNode].size(); i++) {
            if (visited[adjList[startNode].get(i)] == false) {
                dfs(adjList, visited, adjList[startNode].get(i));
            }
        }
    }
    
    /*
    private int find(int[] representative, int vertex) {
        if (vertex == representative[vertex]) {
            return vertex;
        }
        return representative[vertex] = find(representative, representative[vertex]);
    }
    
    private int combine(int[] representative, int[] size, int vertex1, int vertex2) {
        vertex1 = find(representative, vertex1);
        vertex2 = find(representative, vertex2);
        if (vertex1 == vertex2) {
            return 0;
        } else if (size[vertex1] > size[vertex2]) {
            size[vertex1] += size[vertex2];
            representative[vertex2] = vertex1;
        } else {
            size[vertex2] += size[vertex1];
            representative[vertex1] = vertex2;
        }
        return 1;
    }
    */
}

// https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/