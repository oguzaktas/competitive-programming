class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
};

// https://leetcode.com/problems/number-of-good-pairs/
/* Java
public int numIdenticalPairs(int[] A) {
    int res = 0, count[] = new int[101];
    for (int a: A) {
        res += count[a]++;
    }
    return res;
}
*/
/* C++ unordered_map
int numIdenticalPairs(vector<int>& A) {
    int res = 0;
    unordered_map<int, int> count;
    for (int a: A) {
        res += count[a]++;
    }
    return res;
}
*/
/* C++ 1-line
int numIdenticalPairs(vector<int>& A) {
    return accumulate(A.begin(), A.end(), 0, [count = unordered_map<int, int> {}] (auto a, auto b) mutable {
        return a + count[b]++;
    });
}
*/
/* Python
def numIdenticalPairs(self, A):
    return sum(k * (k - 1) / 2 for k in collections.Counter(A).values())
*/