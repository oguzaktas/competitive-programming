class Solution {
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public int numWays(int n, int k) {
        return totalWays(n, k);
    }

    public int totalWays(int n, int k) {
        if (n == 1) {
            return k;
        }
        if (n == 2) {
            return k * k;
        }
        
        if (map.containsKey(n)) {
            return map.get(n);
        }
        map.put(n, (k - 1) * (totalWays(n - 1, k) + totalWays(n - 2, k)));
        return map.get(n);
    }
}

// https://leetcode.com/problems/paint-fence/