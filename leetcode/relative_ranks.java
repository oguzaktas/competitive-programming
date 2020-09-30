class Solution {
    public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];
        Map<Integer, String> medals = Map.of(0, "Gold Medal", 1, "Silver Medal", 2, "Bronze Medal");
        Map<Integer, Integer> indexes = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            indexes.put(nums[i], i);
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int rank = nums.length - 1 - i;
            result[indexes.get(nums[i])] = medals.containsKey(rank) ? medals.get(rank) : String.valueOf(rank + 1);
        }
        return result;
    }
}

// https://leetcode.com/problems/relative-ranks/

/* C++ solution (priority_queue);
vector<string> findRelativeRanks(vector<int>& nums) {
    int n = nums.size();
	priority_queue<pair<int,int>> pq;
	vector<string> ans(n);
	string s;
	for(int i=0;i<n;++i)  pq.push({nums[i],i});
	for(int i=0;i<n;++i){
	  if(i<3){
		switch(i){
		  case 0: s="Gold Medal"; break;
		  case 1: s="Silver Medal"; break;
		  case 2: s="Bronze Medal"; break;
		}
	  }else s = to_string(i+1);
	  ans[pq.top().second] = s;
	  pq.pop();
	}
	return ans;
}
*/

/* Python solution;
class Solution(object):
    def findRelativeRanks(self, nums):
        sorteddata = sorted(nums,reverse=True)
        result = []
        for n in nums:
            if n == sorteddata[0]:
                result.append('Gold Medal')
            elif n == sorteddata[1]:
                result.append('Silver Medal')
            elif n == sorteddata[2]:
                result.append('Bronze Medal')
            else:
                result.append("{}".format(sorteddata.index(n)+1))
        return result
*/