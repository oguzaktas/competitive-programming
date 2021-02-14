class Solution {
    public int maximumWealth(int[][] accounts) {
        int temp = 0, result = 0;
        for (int[] account : accounts) {
            for (int i : account) {
                temp += i;
            }
            result = Math.max(result, temp);
            temp = 0;
        }
        return result;
    }
}

// https://leetcode.com/problems/richest-customer-wealth/
