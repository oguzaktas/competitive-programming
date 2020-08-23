import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

// // https://www.hackerrank.com/challenges/array-left-rotation/problem


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        scanner.close();
        
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            int index = (i + n - d) % n;
            arr[index] = a[i];
        }

        for (int k = 0; k < n; k++) {
            if (k == n-1)
                System.out.print(arr[k]);
            else
                System.out.print(arr[k] + " ");
        }
    }

}
