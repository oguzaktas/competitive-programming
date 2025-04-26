import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            count++;
            System.out.println(count+" " + str);
        }
    }
}

// https://www.hackerrank.com/challenges/java-end-of-file/problem