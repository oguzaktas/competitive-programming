class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] result = new int[queries.length];
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            list.add(i + 1);
        }
        for (int i = 0; i < queries.length; i++) {
            result[i] = list.indexOf(queries[i]);
            list.remove(list.indexOf(queries[i]));
            list.add(0, queries[i]);
        }
        return result;
    }
}

// https://leetcode.com/problems/queries-on-a-permutation-with-key/