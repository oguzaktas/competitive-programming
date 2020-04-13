import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        if (!s.contains("a")) {
            return 0;
        } else if (!s.matches(".*[b-zB-Z0-9].*")) {
            return n;
        } else {
            long count = 0;
            long length = s.length();
            if (n >= length) {
                for (int i = 0; i < length; i++) {
                    if (s.charAt(i) == 'a') {
                        count++;
                    }
                }
                count *= n / length;
                if (n % length != 0) {
                    for (int j = 0; j < n % length; j++) {
                        if (s.charAt(j) == 'a') {
                            count++;
                        }
                    }
                }
            } else {
                for (int k = 0; k < n; k++) {
                    if (s.charAt(k) == 'a') {
                        count++;
                    }
                }
            }
            return count;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
