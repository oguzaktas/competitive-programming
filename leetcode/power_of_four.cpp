class Solution {
public:
    bool isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        if ((n & (n - 1)) == 0) {
            int count = 0;
            int temp = 1;
            while ((temp & n) == 0) {
                count++;
                temp = temp << 1;
            }
            if (count % 2 == 0) {
                return true;
            }
        }
        return false;
    }
};

/*
class Solution {
public:
    bool isPowerOfFour(int n) {
        return (n > 0 && (n & (n - 1)) == 0 && n % 3 == 1);
    }
};
*/