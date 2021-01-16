class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        for (int i : nums) {
            if (elements.contains(i)) {
                return true;
            }
            elements.add(i);
        }
        return false;
    }
}

/* Python solution;
class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        return True if len(set(nums)) < len(nums) else False
*/