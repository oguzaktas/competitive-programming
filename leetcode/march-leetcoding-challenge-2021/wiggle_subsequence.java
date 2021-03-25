class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        if (nums.length == 2 && nums[0] == nums[1]) {
            return 1;
        }
        int[] up = new int[nums.length];
        int[] down = new int[nums.length];
        up[0] = 1;
        down[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                up[i] = down[i - 1] + 1;
                down[i] = down[i - 1];
            } else if (nums[i] < nums[i - 1]) {
                down[i] = up[i - 1] + 1;
                up[i] = up[i - 1];
            } else {
                down[i] = down[i - 1];
                up[i] = up[i - 1];
            }
        }
        return Math.max(down[nums.length - 1], up[nums.length - 1]);
    }
}

// https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/590/week-3-march-15th-march-21st/3676/

/* Initial solution (Wrong answer)
class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 1 || nums.length == 2) {
            return nums.length;
        }
        int currCount = 2, maxCount = 2;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[0] < nums[1]) {
                if (i % 2 == 1) {
                    if (nums[i] > nums[i + 1]) {
                        currCount++;
                        maxCount = Math.max(maxCount, currCount);
                    } else {
                        currCount = 0;
                    }
                } else {
                    if (nums[i] < nums[i + 1]) {
                        currCount++;
                        maxCount = Math.max(maxCount, currCount);
                    } else {
                        currCount = 0;
                    }
                }
            } else if (nums[0] > nums[1]) {
                if (i % 2 == 1) {
                    if (nums[i] < nums[i + 1]) {
                        currCount++;
                        maxCount = Math.max(maxCount, currCount);
                    } else {
                        currCount = 0;
                    }
                }  else {
                    if (nums[i] > nums[i + 1]) {
                        currCount++;
                        maxCount = Math.max(maxCount, currCount);
                    } else {
                        currCount = 0;
                    }
                }
            } else {
                maxCount = Math.max(maxCount, currCount);
                currCount = 0;
            }
        }
        return maxCount;
    }
}
*/

/* Space-optimized dynamic programming solution (O(n) time complexity, O(1) space complexity)
public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int down = 1, up = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                up = down + 1;
            else if (nums[i] < nums[i - 1])
                down = up + 1;
        }
        return Math.max(down, up);
    }
}
*/