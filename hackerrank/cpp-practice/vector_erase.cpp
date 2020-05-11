#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n;
    cin >> n;
    vector<int> v;
    for (int i = 0; i < n; i++) {
        int a;
        cin >> a;
        v.push_back(a);
    }
    int k, l, m;
    cin >> k;
    cin >> l >> m;
    cin.ignore();
    v.erase(v.begin() + k - 1);
    v.erase(v.begin() + l - 1, v.begin() + m - 1);
    cout << v.size() << endl;
    for (auto it = v.begin(); it != v.end(); it++) {
        cout << *it << " ";
    }
    return 0;
}

// https://www.hackerrank.com/challenges/vector-erase/problem