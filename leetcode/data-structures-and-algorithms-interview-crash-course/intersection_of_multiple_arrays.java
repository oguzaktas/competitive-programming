class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int[] arr : nums) {
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        for (int num : map.keySet()) {
            if (map.get(num) == nums.length) {
                result.add(num);
            }
        }
        Collections.sort(result);
        return result;
    }
}

// https://leetcode.com/problems/intersection-of-multiple-arrays/