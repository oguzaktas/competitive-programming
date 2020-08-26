class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n != 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return product - sum;
    }
};

// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
/* Python O(logn) time and space solution;
def subtractProductAndSum(self, n):
    A = map(int, str(n))
    return reduce(operator.mul, A) - sum(A)
*/
/* JavaScript solution;
var subtractProductAndSum = function(n) {
    const digits = Array.from(String(n), Number)
    const sum = digits.reduce((a,b) => a+b)
    const product = digits.reduce((a,b) => a*b)
    return product-sum
};
*/