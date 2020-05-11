class Solution {
    public int search(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        if (!list.contains(target)) {
            return -1;
        } else {
            return list.indexOf(target);
        }
    }
}

// https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/530/week-3/3304/discuss/587173/C++-Solution-STL
/* C++ solution STL
class Solution {
public:
    int search(vector<int>& nums, int target) {
        int ans = -1;
        auto it = find(nums.begin(), nums.end(), target);
        if(it == nums.end()) return ans;
        else return it-nums.begin();
    }
};
*/