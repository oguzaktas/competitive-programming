class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> result;
        vector<int> comb;
        findCombinations(0, candidates, target, 0, comb, result);
        return result;
    }
    
    void findCombinations(int i, vector<int> &candidates, int target, int sum, vector<int> &combination, vector<vector<int>> &result) {
        if (i == candidates.size() || sum > target) {
            return;
        }
        if (sum == target) {
            result.push_back(combination);
            return;
        }
        combination.push_back(candidates[i]);
        findCombinations(i, candidates, target, sum + candidates[i], combination, result);
        combination.pop_back(); // backtrack
        findCombinations(i + 1, candidates, target, sum, combination, result);
    }
};

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3481/