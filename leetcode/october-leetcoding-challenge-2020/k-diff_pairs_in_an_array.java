import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5};
        int k = 2;
        System.out.println(findPairs(nums, k));
    }

    class Solution {
        public int findPairs(int[] nums, int k) {
            List<Integer> unique = new ArrayList<Integer>();
            int result = 0;
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == nums[i] + k) {
                        if (!unique.contains(nums[i])) {
                            unique.add(nums[i]);
                            result++;
                        }
                        break;
                    }
                }
            }
            return result;
        }
    }
    
}

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3482/