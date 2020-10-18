class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int max;
        for (int i = 0; i < arr.size() - 1; i++) {
            max = arr[i + 1];
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.size() - 1] = -1;
        return arr;
    }
};

// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
// Time complexity of this solution = O(n*n)

/* Another solution with less runtime;
class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int n = arr.size();
        vector<int> greatest(n);
        int curr_max = arr[n - 1];
        greatest[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            greatest[i] = curr_max;
            if (arr[i] > curr_max){
                curr_max = arr[i];
            }
        }
        return greatest;      
    }
};
*/

/* Tricky method with one loop (O(n) complexity);
class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int max = arr[arr.size() - 1];
        for (int i = arr.size() - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (max < temp) {
                max = temp;
            }
        }
        return arr;
    }
}
*/