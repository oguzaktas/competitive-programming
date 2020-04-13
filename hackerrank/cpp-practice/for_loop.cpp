#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;
    string s[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    for (int i = a; i <= b; i++) {
        if (i < 10) {
            cout << s[i-1] << endl;
        } else {
            if (i % 2 == 0) {
                cout << "even" << endl;
            } else {
                cout << "odd" << endl;
            }
        }
    }
    /*
    for (int i = a; i <= b; i++) {
        cout << ((i <= 9) ? c[i - 1] : ((i % 2 == 0) ? "even" : "odd")) << endl;
    }
    */
    return 0;
}
