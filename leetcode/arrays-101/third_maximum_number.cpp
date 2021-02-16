class Solution {
public:
    int thirdMax(vector<int>& nums) {
        set<int> st(nums.begin(), nums.end());
        return st.size() < 3 ? *prev(st.end()) : *prev(st.end(), 3);
    }
};

// https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3231/

/* C++ STL unique solution;
int thirdMax(vector<int>& nums) {
	sort(nums.begin(), nums.end());
	auto it = unique(nums.begin(), nums.end());
	nums.erase(it, nums.end());
	if (nums.size() < 3) {
        return nums.back();
    }
	return nums[nums.size() - 3];
}
*/

/* C++ solution (Set contains less than or equal to 3 elements)
int thirdMax(vector<int>& nums) {
	set<int> st;
	for(auto c : nums){
		st.insert(c);
		if (st.size() > 3) {
            st.erase(*st.begin());
        }
	}
	return st.size() == 3 ? *st.begin() : *prev(st.end());
}
*/