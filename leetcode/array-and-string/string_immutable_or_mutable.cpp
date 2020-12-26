#include <iostream>

int main() {
    string s1 = "Hello World";
    s1[5] = ',';
    cout << s1 << endl;
}

/*
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        String s1 = "Hello World";
        s1[5] = ',';
        System.out.println(s1);
    }
}
*/

/*
In some languages (like C++), the string is mutable. That is to say, you can modify the string just like what you did in an array. 
In some other languages (like Java), the string is immutable. This feature will bring several problems.
*/