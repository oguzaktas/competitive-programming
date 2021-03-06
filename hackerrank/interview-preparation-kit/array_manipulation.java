import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/crush/problem

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long[] a = new long[n];
        int m = queries.length;
        long max = a[0];
        for (int i = 0; i < m; i++) {
            for (int j = queries[i][0] - 1; j < queries[i][1]; j++) {
                a[j] += queries[i][2];
                max = Math.max(max, a[j]);
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

/** Other Java solution passed all test cases
static long arrayManipulation(int n, int[][] queries) {
        if (n == 0 || queries.length == 0)
            return 0L;
        long a[] = new long[n+2];
        long max = 0;
        for (int[] query : queries) {
            a[query[0]] = a[query[0]] + query[2];
            a[query[1] + 1] = a[query[1] + 1] - query[2];
        }
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            max = Math.max(max, sum);
        }
        return max;
    }
*/