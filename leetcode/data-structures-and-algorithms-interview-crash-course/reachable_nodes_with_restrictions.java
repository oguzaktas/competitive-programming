class Solution {
    private int answer = 0;
    
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        Map<Integer, List<Integer>> neighbors = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            neighbors.computeIfAbsent(a, value -> new ArrayList<Integer>()).add(b);
            neighbors.computeIfAbsent(b, value -> new ArrayList<Integer>()).add(a);
        }
        Set<Integer> seen = new HashSet<>();
        for (int node : restricted) {
            seen.add(node);
        }
        // recursive dfs
        dfs(0, neighbors, seen);
        /* iterative dfs
        seen.add(0);
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        while (!stack.isEmpty()) {
            int currentNode = stack.pop();
            answer++;
            for (int nextNode : neighbors.get(currentNode)) {
                if (!seen.contains(nextNode)) {
                    seen.add(nextNode);
                    stack.add(nextNode);
                }
            }
        }
        */
        return answer;
    }
    
    private void dfs(int currentNode, Map<Integer, List<Integer>> neighbors, Set<Integer> seen) {
        answer++;
        seen.add(currentNode);
        for (int nextNode : neighbors.get(currentNode)) {
            if (!seen.contains(nextNode)) {
                dfs(nextNode, neighbors, seen);
            }
        }
    }
}

// https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/707/traversals-trees-graphs/4629/