class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] != i) {
                int index = nums[i - 1] - 1;
                while (nums[index] != index + 1) {
                    int temp = nums[index] - 1;
                    nums[index] = index + 1;
                    index = temp;
                }
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                result.add(j + 1);
            }
        }
        return result;
    }
}

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

/* Python solution;
class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        set_result = set(range(1,len(nums)+1))
        set_nums = set(nums)
        return list(set_result-set_nums)
*/