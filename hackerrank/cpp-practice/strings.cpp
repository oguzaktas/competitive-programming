#include <iostream>
#include <string>
using namespace std;

int main() {
    string a, b;
    cin >> a >> b;
    cin.ignore();
    cout << a.length() << " " << b.length() << endl;
    cout << a + b << endl;
    char temp = a[0]; // or using swap(a[0], b[0]);
    a[0] = b[0];
    b[0] = temp;
    cout << a << " " << b;
  
    return 0;
}
