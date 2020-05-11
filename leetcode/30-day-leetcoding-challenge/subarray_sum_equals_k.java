/* My solution (brute force) - time limit exceeded
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                int sum = 0;
                for (int l = i; l < j; l++) {
                    sum += nums[l];
                }
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i <= nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        for (int j = 0; j < nums.length; j++) {
            for (int l = j + 1; l <= nums.length; l++) {
                if (sum[l] - sum[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }
}

// https://leetcode.com/problems/subarray-sum-equals-k/