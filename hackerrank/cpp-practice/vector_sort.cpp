#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

// https://www.hackerrank.com/challenges/vector-sort/problem?h_r=profile

int main() {
    int n;
    cin >> n;
    vector<int> a;
    for (int i = 0; i < n; i++) {
        int k;
        cin >> k;
        a.push_back(k);
    }
    sort(a.begin(), a.end());
    for (auto it = a.begin(); it != a.end(); ++it) {
        cout << *it << " ";
    }
    return 0;
}
