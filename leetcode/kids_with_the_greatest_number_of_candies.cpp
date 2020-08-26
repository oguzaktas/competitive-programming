class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> result;
        int max = *max_element(candies.begin(), candies.end());
        // https://www.geeksforgeeks.org/how-to-find-the-maximum-element-of-a-vector-using-stl-in-c/
        for (int i = 0; i < candies.size(); i++) {
            if (candies[i] + extraCandies >= max) {
                result.push_back(true);
            } else {
                result.push_back(false);
            }
        }
        return result;
    }
};

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/