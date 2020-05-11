#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

// https://www.hackerrank.com/challenges/cpp-lower-bound/problem

int main() {
    int n, k;
    vector<int> v;
    cin >> n;
    int a;
    for (int i = 0; i < n; i++) {
        int a;
        cin >> a;
        v.push_back(a);
    }
    cin >> k;
    for (int j = 0; j < k; j++) {
        int b;
        cin >> b;
        vector<int>::iterator low = lower_bound(v.begin(), v.end(), b);
        if (v[low - v.begin()] == b) {
            cout << "Yes " << low - v.begin() + 1 << endl;
        } else {
            cout << "No " << low - v.begin() + 1 << endl;
        }
    }
    return 0;
}
