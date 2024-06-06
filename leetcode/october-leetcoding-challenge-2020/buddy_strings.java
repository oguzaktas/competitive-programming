class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A == null || B == null || A.length() != B.length()) {
            return false;
        }
        int a = -1, b = -1, diff = 0;
        int[] count = new int[26];
        boolean canSwitch = false;
        for (int i = 0; i < A.length(); i++) {
            if (++count[A.charAt(i) - 'a'] >= 2)
                canSwitch = true;
            if (A.charAt(i) != B.charAt(i)) {
                diff++;
                if (a == -1)
                    a = i;
                else if (b == -1)
                    b = i;
            }
        }
        return (diff == 0 && canSwitch) || (diff == 2 && A.charAt(a) == B.charAt(b) && A.charAt(b) == B.charAt(a));
    }
}

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/560/week-2-october-8th-october-14th/3492/
/* Python solution;
class Solution:
    def buddyStrings(self, A: str, B: str) -> bool:
        A = list(A)
        B = list(B)
        if len(A)!=len(B): return False
        C = [i for i in range(len(A)) if A[i] != B[i]]
        if len(C)==2 and A[C[0]]==B[C[1]] and A[C[1]]==B[C[0]]: return True
        if not C:
            if len(A)>len(set(A)): return True
        return False
*/