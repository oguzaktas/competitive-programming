class Solution {
public:
    string restoreString(string s, vector<int>& indices) {
        string result = s;
        for (int i = 0; i < indices.size(); i++) {
            result[indices[i]] = s[i];
        }
        return result;
    }
};

// https://leetcode.com/problems/shuffle-string/
/* Java solution
class Solution {
    public String restoreString(String s, int[] in) {
        char[] c = new char[in.length];
        for(int i = 0; i < in.length; i++)
            c[in[i]] = s.charAt(i);
        return new String(c);
    }
}
*/
// C++ O(n) time, O(1) space -> https://leetcode.com/problems/shuffle-string/discuss/773250/C%2B%2B-easy-O(N)-time-O(1)-space