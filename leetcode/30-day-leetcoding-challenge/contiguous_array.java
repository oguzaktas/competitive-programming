// https://leetcode.com/problems/contiguous-array/

public class Solution {

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }
}

/* Approach 1: Brute Force [Time Limit Exceeded]
Complexity analysis -> Time complexity: O(n^2), we consider every possible subarray by traversing over the complete array for every start point possible.
Space complexity: O(1), only two variables zeroes and ones are required.
*/