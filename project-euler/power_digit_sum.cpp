#include <iostream>
using namespace std;

#define MAX 100000

int multiply(int x, int res[], int res_size) {
    // Number of digits in the number represented by res[]
    int carry = 0;
    for (int i = 0; i < res_size; i++) {
        int prod = res[i] * x + carry;
        res[i] = prod % 10;
        carry = prod / 10;
    }

    while (carry) {
        res[res_size] = carry % 10;
        carry /= 10;
        res_size++;
    }

    return res_size;
}

int power(int x, int n) {
    if (n == 0) {
        cout << "1";
        return 1;
    }

    int res[MAX];
    int res_size = 0;
    int temp = x;

    while (temp != 0) {
        res[res_size++] = temp % 10;
        temp /= 10;
    }

    for (int i = 2; i <= n; i++) {
        res_size = multiply(x, res, res_size);
    }
    cout << x << "^" << n << " = ";
    int result = 0;
    for (int i = res_size - 1; i >= 0; i--) {
        cout << res[i];
        result += res[i];
    }
    cout << endl;
    return result;
}

int main() {
    cout << power(2, 1000) << endl;
    return 0;
}

// https://www.geeksforgeeks.org/writing-power-function-for-large-numbers/