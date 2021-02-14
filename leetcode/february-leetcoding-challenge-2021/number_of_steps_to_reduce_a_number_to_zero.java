class Solution {
    public int numberOfSteps (int num) {
        if (num == 0) {
            return 0;
        }
        int count = 0;
        while (num != 0) {
            if (num % 2 == 1) {
                num -= 1;
            } else {
                num /= 2;
            }
            count++;
        }
        return count;
    }
}

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/585/week-2-february-8th-february-14th/3637/

/* C++ solution (bit manipulation)
class Solution {
public:
    int numberOfSteps (int num) {      
        cout << num << endl;
        if (num == 0)
            return 0;
        if (num == 1)
            return 1;
        if (num & 1) {
            return 1 + numberOfSteps(num - 1);
        }
        return 1 + numberOfSteps(num / 2);
    }
};
*/