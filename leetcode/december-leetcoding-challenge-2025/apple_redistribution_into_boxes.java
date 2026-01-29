class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int i = 0; i < apple.length; i++) {
            sum += apple[i];
        }
        Arrays.sort(capacity);
        int capacities = 0, count = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            capacities += capacity[i];
            count++;
            if (capacities >= sum) {
                return count;
            }
        }
        return count;
    }
}

// https://leetcode.com/problems/apple-redistribution-into-boxes/?envType=daily-question&envId=2025-12-24