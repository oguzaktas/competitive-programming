class Solution {
public:
    bool backspaceCompare(string S, string T) {
        int i = S.size() - 1, j = T.size() - 1, countA = 0, countB = 0;
        while (i >= 0 || j >= 0) {
            while (i >= 0 && (S[i] == '#' || countA > 0)) {
                S[i--] == '#' ? ++countA : --countA;
            }
            while (j >= 0 && (T[j] == '#' || countB > 0)) {
                T[j--] == '#' ? ++countB : --countB;
            }
            if (i < 0 || j < 0) {
                return i == j;
            }
            if (S[i--] != T[j--]) {
                return false;
            }
        }
        return i == j;
    }
};

/* Stack - O(n) space - C++
class Solution {
public:
    bool backspaceCompare(string S, string T) {
        string a = "", b = "";
        for(auto c: S) c == '#' ? a.size() > 0 ? a.pop_back() : void() : a.push_back(c);
        for(auto c: T) c == '#' ? b.size() > 0 ? b.pop_back() : void() : b.push_back(c);
        return a == b;
    }
};
*/

/* Approach 1: Build String - Java
Complexity analysis -> Time complexity: O(M+N) = O(n), where M and N are the lengths of S and T strings
Space complexity: O(M+N)

class Solution {
    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public String build(String S) {
        Stack<Character> ans = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }
}
*/

/* Approach 2: Two Pointer - Java
Complexity analysis -> Time complexity: O(M+N), space complexity: O(1)

class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) { // While there may be chars in build(S) or build (T)
            while (i >= 0) { // Find position of next possible char in build(S)
                if (S.charAt(i) == '#') {skipS++; i--;}
                else if (skipS > 0) {skipS--; i--;}
                else break;
            }
            while (j >= 0) { // Find position of next possible char in build(T)
                if (T.charAt(j) == '#') {skipT++; j--;}
                else if (skipT > 0) {skipT--; j--;}
                else break;
            }
            // If two actual characters are different
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;
            // If expecting to compare char vs nothing
            if ((i >= 0) != (j >= 0))
                return false;
            i--; j--;
        }
        return true;
    }
}
*/
