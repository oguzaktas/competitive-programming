// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        String s = "";
        int n = 10000;
        for (int i = 0; i < n; i++) {
            s += "hello";
        }
    }
}

/*
#include <iostream>

int main() {
    string s = "";
    int n = 10000;
    for (int i = 0; i < n; i++) {
        s += "hello";
    }
}
*/

/*
In Java, since the string is immutable, concatenation works by first allocating enough space for the new string, copy the contents from the old string and append to the new string.
Therefore, the time complexity in total will be: 5 + 5 × 2 + 5 × 3 + … + 5 × n = 5 × (1 + 2 + 3 + … + n) = 5 × n × (n + 1) / 2,
which is O(n2).
*/

// 1. If you did want your string to be mutable, you can convert it to a char array.
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        char[] str = s.toCharArray();
        str[5] = ',';
        System.out.println(str);
    }
}

// 2. If you have to concatenate strings often, it will be better to use some other data structures like StringBuilder. The below code runs in O(n) complexity.
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int n = 10000;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append("hello");
        }
        String s = str.toString();
    }
}