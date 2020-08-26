class Solution {
public:
    int numberOfSteps (int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            count++;
        }
        return count;
    }
};

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
/* C++ O(1) solution without iteration or recursion
https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/discuss/507736/C%2B%2B-O(1)-solution-without-iterationrecursion
return num ? __builtin_popcount(num) + 31 - __builtin_clz(num) : 0;
*/
/* Python 3 solution
class Solution:
    def numberOfSteps (self, num: int) -> int:
        digits = f'{num:b}'
        return digits.count('1') - 1 + len(digits)
*/