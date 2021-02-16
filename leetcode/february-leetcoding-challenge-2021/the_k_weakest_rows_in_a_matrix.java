class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    count++;
                }
            }
            map.put(i, count);
            count = 0;
        }
        Object[] a = map.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
            return ((Map.Entry<Integer, Integer>) o2).getValue().compareTo(((Map.Entry<Integer, Integer>) o1).getValue());
            }
        });
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = ((Map.Entry<Integer, Integer>) a[i]).getKey();
        }
        return result;
    }
}

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/586/week-3-february-15th-february-21st/3641/