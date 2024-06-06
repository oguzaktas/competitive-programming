class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = (int) 1e6;
        while (left < right) {
            int sum = 0, middle = (left + right) / 2;
            for (int i : nums) {
                sum += (i + middle - 1) / middle;
            }
            if (sum > threshold) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }
}

// https://leetcode.com/explore/challenge/card/november-leetcoding-challenge/564/week-1-november-1st-november-7th/3521/

/* Linear time brute force solution (time limit exceeded);
class Solution {
    public int computeSum(int[] nums, int x) {
        int s = 0;
        for (int n : nums) {
            s += n / x + (n % x == 0 ? 0 : 1); 
        }
        return s;
    }    
    public int smallestDivisor(int[] nums, int threshold) {
        int d = 1;        
        while(computeSum(nums, d) > threshold) {
            ++d;
        }

        return d;
    }
}
*/
/* Python solution (same approach: binary search);
def smallestDivisor(self, A, threshold):
    l, r = 1, max(A)
    while l < r:
        m = (l + r) / 2
        if sum((i + m - 1) / m for i in A) > threshold:
            l = m + 1
        else:
            r = m
    return l
*/