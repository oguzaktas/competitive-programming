#include <iostream>

template <size_t n, size_t m>
void printArray(int (&a)[n][m]) {
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            cout << a[i][j] << " ";
        }
        cout << endl;
    }
}

int main() {
    cout << "Example I:" << endl;
    int a[2][5];
    printArray(a);
    cout << "Example II:" << endl;
    int b[2][5] = {{1, 2, 3}};
    printArray(b);
    cout << "Example III:"<< endl;
    int c[][5] = {1, 2, 3, 4, 5, 6, 7};
    printArray(c);
    cout << "Example IV:" << endl;
    int d[][5] = {{1, 2, 3, 4}, {5, 6}, {7}};
    printArray(d);
}

/*
// "static void main" must be defined in a public class.
public class Main {
    private static void printArray(int[][] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; a[i] != null && j < a[i].length; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Example I:");
        int[][] a = new int[2][5];
        printArray(a);
        System.out.println("Example II:");
        int[][] b = new int[2][];
        printArray(b);
        System.out.println("Example III:");
        b[0] = new int[3];
        b[1] = new int[5];
        printArray(b);
    }
}
*/