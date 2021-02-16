class Solution {
    public int[] sortArrayByParity(int[] A) {
        return Arrays.stream(A).boxed().sorted((a, b) -> Integer.compare(a % 2, b % 2)).mapToInt(i -> i).toArray();
    }
}

// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/
/* Two pass approach solution;
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int t = 0;
        for (int i = 0; i < A.length; i++)
            if (A[i] % 2 == 0)
                ans[t++] = A[i];
        for (int i = 0; i < A.length; i++)
            if (A[i] % 2 == 1)
                ans[t++] = A[i];
        return ans;
    }
}
*/

/* In-place operation Java solution;
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
            if (A[i] % 2 == 0) {
                i++;
            }
            if (A[j] % 2 == 1) {
                j--;
            }
        }
        return A;
    }
}
*/

/* C++ one pass solution;
vector<int> sortArrayByParity(vector<int>& A) {
    int l = 0, r = A.size() - 1;
    while (l < r) {
        if (A[l] % 2 != 0) {
            swap(A[l], A[r]);
            --r;
        } else {
            ++l;
        }
    }
    return A;
}
*/