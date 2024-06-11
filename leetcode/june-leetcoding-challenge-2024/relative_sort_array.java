class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Counting sort O(n + m + k) solution
        int max = Arrays.stream(arr1).max().orElse(0);
        int[] count = new int[max + 1];
        for (int element : arr1) {
            count[element]++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i : arr2) {
            while (count[i] > 0) {
                result.add(i);
                count[i]--;
            }
        }
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                result.add(i);
                count[i]--;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
        /* using HashMap O(m + nlogn) solution
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> remaining = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i : arr2) {
            map.put(i, 0);
        }
        for (int i : arr1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                remaining.add(i);
            }
        }
        Collections.sort(remaining);
        for (int i : arr2) {
            for (int j = 0; j < map.get(i); j++) {
                result.add(i);
            }
        }
        result.addAll(remaining);
        return result.stream().mapToInt(Integer::intValue).toArray();
        */
    }
}

// https://leetcode.com/problems/relative-sort-array/?envType=daily-question&envId=2024-06-11