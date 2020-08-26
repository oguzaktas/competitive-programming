class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] > nums[j]) {
                    result[i]++;
                }
            }
        }
        return result;
    }
}

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
/* Java HashMap solution;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = nums.clone();
        Arrays.sort(copy);
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(copy[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            copy[i] = map.get(nums[i]);
        }       
        return copy;
    }
}
*/
/* Python3 solution;
class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        result = []
        tempNums = nums.copy()
        nums.sort()
        for n in tempNums:
            result.append(nums.index(n))
        return result
*/