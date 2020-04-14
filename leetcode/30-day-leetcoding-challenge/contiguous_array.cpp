class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int, int> mp;
        mp[0] = -1;
        int count = 0, sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums[i] ? 1 : -1;
            if (mp.find(sum) != mp.end()) {
                count = max(i - mp[sum], count);
            } else {
                mp[sum] = i;
            }
        }
        return count;
    }
};

/* Solution - Approach 1: Brute Force [Time Limit Exceeded]
The brute force approach is really simple. We consider every possible subarray within the given array and count the number of zeros and ones in each subarray. 
Then, we find out the maximum size subarray with equal no. of zeros and ones out of them.
Complexity analysis -> Time complexity: O(n^2), we consider every possible subarray by traversing over the complete array for every start point possible.
Space complexity -> O(1), only two variables zeroes and ones are required.

public class Solution {
    public int findMaxLength(int[] nums) {
        int maxlen = 0;
        for (int start = 0; start < nums.length; start++) {
            int zeroes = 0, ones = 0;
            for (int end = start; end < nums.length; end++) {
                if (nums[end] == 0) {
                    zeroes++;
                } else {
                    ones++;
                }
                if (zeroes == ones) {
                    maxlen = Math.max(maxlen, end - start + 1);
                }
            }
        }
        return maxlen;
    }
}
*/

/* Approach 2: Using Extra Array
Complexity analysis -> Time complexity: O(n), the complete array is traversed only once.
Space complexity -> O(n), arr array of size (2n+1) is used.

public class Solution {
    public int findMaxLength(int[] nums) {
        int[] arr = new int[2 * nums.length + 1];
        Arrays.fill(arr, -2);
        arr[nums.length] = -1;
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 0 ? -1 : 1);
            if (arr[count + nums.length] >= -1) {
                maxlen = Math.max(maxlen, i - arr[count + nums.length]);
            } else {
                arr[count + nums.length] = i;
            }

        }
        return maxlen;
    }
}
*/

/* Approach 3: Using HashMap
Complexity analysis -> Time complexity: O(n), the entire array is traversed only once.
Space complexity: O(n), maximum size of the HashMap map will be n, if all the elements are either 1 or 0.

public class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }
}
*/