class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int[] i : flights) {
            adj.computeIfAbsent(i[0], value -> new ArrayList<>()).add(new int[] {i[1], i[2] });
        }
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {src, 0});
        int stops = 0;
        while (stops <= k && !queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] temp = queue.remove();
                int node = temp[0];
                int distance = temp[1];
                if (!adj.containsKey(node)) {
                    continue;
                }
                for (int[] e : adj.get(node)) {
                    int remove = e[0];
                    int price = e[1];
                    if (price + distance >= dist[remove]) {
                        continue;
                    }
                    dist[remove] = price + distance;
                    queue.offer(new int[] { remove, dist[remove] });
                }
            }
            stops++;
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}

// https://leetcode.com/problems/cheapest-flights-within-k-stops/?envType=daily-question&envId=2024-02-23