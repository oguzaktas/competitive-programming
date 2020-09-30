class Solution {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        int[] cache = new int[N + 1];
        cache[1] = 1;
        for (int i = 2; i <= N; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[N];
    }
}

/* Recursive solution
class Solution {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        return fib(N - 1) + fib(N - 2);
    }
}
*/

// https://leetcode.com/problems/fibonacci-number/