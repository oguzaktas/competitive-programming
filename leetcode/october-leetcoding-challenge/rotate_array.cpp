class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        vector<int> a(nums.size()); // https://www.geeksforgeeks.org/initialize-a-vector-in-cpp-different-ways/
        for (int i = 0; i < nums.size(); i++) {
            a[(i + k) % nums.size()] = nums[i];
        }
        for (int i = 0; i < nums.size(); i++) {
            nums[i] = a[i];
        }
    }
};

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/561/week-3-october-15th-october-21st/3496/

/* Time limit exceeded with two loops brute force approach;
class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int previous, temp;
        k %= nums.size();
        for (int i = 0; i < k; i++) {
            previous = nums[nums.size() - 1];
            for (int j = 0; j < nums.size(); j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
};
*/

/* 0 ms runtime solution C++;
class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        k = k % nums.size();
        int count = 0;
        for (int start = 0; count < nums.size(); start++) {
          int current = start;
          int prev = nums[start];
          do {
            int next = (current + k) % nums.size();
            int temp = nums[next];
            nums[next] = prev;
            prev = temp;
            current = next;
            count++;
          } while (start != current);
        }
    }
};
*/