class Solution {
    public int search(int[] nums, int target) {
        int index =  Arrays.binarySearch(nums, target);
	    if (index >= 0)
		    return index;
	    else
		    return -1;
    }
}

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/560/week-2-october-8th-october-14th/3488/
/* C++ solution;
class Solution {
  public:
  int search(vector<int>& nums, int target) {
    int pivot, left = 0, right = nums.size() - 1;
    while (left <= right) {
      pivot = left + (right - left) / 2;
      if (nums[pivot] == target) return pivot;
      if (target < nums[pivot]) right = pivot - 1;
      else left = pivot + 1;
    }
    return -1;
  }
};
*/