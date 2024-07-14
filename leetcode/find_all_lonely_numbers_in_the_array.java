class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1 && !map.containsKey(num + 1) && !map.containsKey(num - 1)) {
                answer.add(num);
            }
        }
        return answer;
    }
}

// https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/