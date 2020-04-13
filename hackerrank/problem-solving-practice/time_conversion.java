import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String format = s.substring(s.length() - 2);
        String time = s.substring(0, 8);
        if (format.equals("AM")) {
            if (time.substring(0, 2).equals("12")) {
                time = "00" + time.substring(time.length() - 6);
            }
        } else if (format.equals("PM")) {
            if (!s.substring(0, 2).equals("12")) {
                time = String.valueOf(Integer.parseInt(time.substring(0, 2)) + 12) + time.substring(time.length() - 6);
            }
        }
        return time;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
