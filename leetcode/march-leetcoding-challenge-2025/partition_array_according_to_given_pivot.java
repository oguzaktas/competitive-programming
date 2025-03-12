class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int count = 0;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                left.add(nums[i]);
            } else if (nums[i] > pivot) {
                right.add(nums[i]);
            } else {
                count++;
            }
        }
        result.addAll(left);
        for (int i = 0; i < count; i++) {
            result.add(pivot);
        }
        result.addAll(right);
        return result.stream().mapToInt(i -> i).toArray();
    }
}

// https://leetcode.com/problems/partition-array-according-to-given-pivot/?envType=daily-question&envId=2025-03-03