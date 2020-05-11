#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
using namespace std;


int main() {
    int k, n;
    cin >> k; 
    map<string,int> map;
    string name;
    for (int i = 0, mark; i < k; i++) {
        cin >> n >> name;
        cin.ignore();
        if (n == 1) {
            cin >> mark;
            map[name] += mark;
        } else if (n == 2) {
            map.erase(name);
        } else {
            cout << map[name] << endl;
        }
    }
    return 0;
}
