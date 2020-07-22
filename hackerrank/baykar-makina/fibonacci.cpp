#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

static vector<int> v;

void printFibonacci(int n) {
    static int n1 = 1, n2 = 1, n3;
    if(n > 0) {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        bool isPrime = true;
        for (int i = 2; i <= n3 / 2; ++i) {
            if (n3 % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true) {
            v.push_back(n3);
        }
        printFibonacci(n-1);
    }
}

int main()
{
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;
    cout << "Result: ";
    printFibonacci(n-2);
    reverse(v.begin(), v.end());
    for (const auto &i: v)
        cout << i << ' ';
    return 0;
}
