class Solution {
    public int findMaxLength(int[] nums) {
        int[] max = new int[2 * nums.length + 2];
        int current = nums.length;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            current += (nums[i] << 1) - 1;
            if (current == nums.length) {
                result = i + 1;
            } else if (max[current] == 0) {
                max[current] = i + 1;
            } else {
                result = Math.max(result, i - max[current] + 1);
            }
        }
        return result;
        /*
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int max = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                max = Math.max(max, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return max;
        */
    }
}

// https://leetcode.com/problems/contiguous-array/?envType=daily-question&envId=2024-03-16