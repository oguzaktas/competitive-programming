import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

     Locale locale = new Locale("en", "IN");

    if(payment>=0 && payment<=Math.pow(10, 9)){

       String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
       String india = NumberFormat.getCurrencyInstance(locale).format(payment);
       String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
       String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }  
    }
}

// https://www.hackerrank.com/challenges/java-currency-formatter/problem