#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int cozum(int arr[]) {
    int min = arr[0];
    int index = 0;
    int length = sizeof(arr);
    while (arr[index] % 2 == 0)
        index++; // cift sayilari gec
    min = arr[index++]; // ilk tek sayi
    while (index < length) {
        if (arr[index] % 2) {
            if (arr[index] < min) {
                min = arr[index];
            }
        }
        index++;
    }
    return min;
}

int main()
{
    int a[] = {6, 13, 20, 3, 5, 6, 8};
    cout << cozum(a);
    return 0;
}
