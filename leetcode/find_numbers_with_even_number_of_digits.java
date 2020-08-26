class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            while (num != 0) {
                digits++;
                num /= 10;
            }
            if (digits % 2 == 0)
                count++;
        }
        return count;
    }
}

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
/* Simple Java solution with constraints
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i =0 ; i< nums.length; i++){   
            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000)){
                count++;
            }
        }
        return count;       
    }
}