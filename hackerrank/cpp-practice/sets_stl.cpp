#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;

// https://www.hackerrank.com/challenges/cpp-sets/problem

int main() {
    set<int> s;
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int k, l;
        cin >> k >> l;
        cin.ignore();
        if (k == 1) {
            s.insert(l);
        } else if (k == 2) {
            s.erase(l);
        } else if (k == 3) {
            set<int>::iterator itr = s.find(l);
            if (itr != s.end()) {
                cout << "Yes" << endl;
            } else {
                cout << "No" << endl;
            }
        }
    }
    return 0;
}
