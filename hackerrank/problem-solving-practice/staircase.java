import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(final int n) {
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (n - j > 0) {
                System.out.print(" ");
                j++;
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) {
        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}

/* Basic C# implementation;
using System;
class Solution
{
    static void Main(String[] args)
    {
        int N = int.Parse(Console.ReadLine());
        for (int i = 0; i < N; i++)
            Console.WriteLine(new String('#', i + 1).PadLeft(N, ' '));
    }
}
*/

/* Basic Java implementation
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i <n ; i++) 
        builder.append(" ");
    int j = 0;
    for (int i = 1; i <=n; i++) {
        builder.replace(builder.length()-i,          
        builder.length() - j, "#");
        System.out.println(builder);
        j++;
    }
}
*/