import java.io.*;
import java.util.*;

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();

    public static void main(String[] args) throws Exception {
        try {
            if (B > 0 && H > 0) {
                int area = B * H;
                System.out.print(area);
            } else {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// https://www.hackerrank.com/challenges/java-static-initializer-block/problem