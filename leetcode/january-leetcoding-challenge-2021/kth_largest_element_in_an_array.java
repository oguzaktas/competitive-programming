class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int max = 0;
        for (int i = 0; i < k; i++) {
            max = Collections.max(list);
            list.remove(list.indexOf(new Integer(max)));
        }
        return max;
    }
}

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/581/week-3-january-15th-january-21st/3606/

/* C++ solution;
int findKthLargest(vector<int>& nums, int k) {
    sort(nums.begin(), nums.end());
    return nums[nums.size() - k];
}
*/

/* Python solution;
class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        return sorted(nums)[-k]
*/