class Solution {
public:
    vector<int> decompressRLElist(vector<int>& nums) {
        vector<int> result;
        for (int i = 0; i < nums.size(); i += 2) {
            for (int j = 0; j < nums[i]; j++)
                result.push_back(nums[i+1]);
        }
        return result;
    }
};

// https://leetcode.com/problems/decompress-run-length-encoded-list/
/* Python 1-line solution with intuition (O(n) time and space)
def decompressRLElist(self, A):
    return [x for a, b in zip(A[0::2], A[1::2]) for x in [b] * a]
*/