def findUnique(a, k, n):
    d = {}
    for i in a:
        if i in d:
            d[i] += 1
        else:
            d[i] = 1
    for i, j in d.items():
        if (j == 1):
            return i

T = int(input())
for i in range(T):
    n, k = map(int, input().split())
    a = list(map(int, input().rstrip().split()))
    print(findUnique(a, k, n))

# https://practice.geeksforgeeks.org/problems/find-unique-element/0
''' C++ solution;
#include <iostream>
using namespace std;
int main() 
{
	int t; cin >> t;
	while (t--) {
	    int n, k;
        cin >> n >> k;
        int a[n], h[10001] = {0};
	    for (int i = 0; i < n; i++)
            cin >> a[i];
	    for (int i = 0; i < n; i++) {
            h[a[i]]++;
        }
	    for (int i = 0; i < 10001; i++) {
            if (h[i] == 1)
                cout << i << endl;
        }
	}
	return 0;
}
'''