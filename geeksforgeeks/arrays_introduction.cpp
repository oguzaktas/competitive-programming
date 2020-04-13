#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

// https://www.geeksforgeeks.org/arrays-in-c-cpp/
// https://www.hackerrank.com/challenges/arrays-introduction/problem

int main() {
    int n, i = 0;
    cin >> n;
    int *a = new int[n]; // that's for dynamically allocating memory, it adjusts its size according to the input during runtime
    while (cin >> a[i++]);
    while (cout << a[--n] << ' ' && n);
    delete[] a; // to delete the dynamically allocated memory from heap
    return 0;
}
