#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
	vector<int> nums;
    string output;
    stringstream ss(str);
    for (int i; ss >> i;) {
        nums.push_back(i);
        if (ss.peek() == ',') {
            ss.ignore();
        }
    }
    return nums;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}
