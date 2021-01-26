class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1, sum;
        while (i < j) {
            sum = nums[i] + nums[j];
            if (sum == k) {
                count++;
                i++;
                j--;
            } else if (sum < k) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/581/week-3-january-15th-january-21st/3608/

/* JS solution
var maxOperations = function(nums, k) {
    const seen = new Map();
    let count = 0;  
    for (let i = 0; i < nums.length; i++) {
        const diff = k - nums[i];
        if (!seen.has(diff)) {
            seen.set(nums[i], (seen.get(nums[i]) || 0) + 1);
            continue;
        }
        seen.set(diff, seen.get(diff) - 1);
        if (!seen.get(diff))
            seen.delete(diff);
        count++;
    }
    return count;    
};
*/