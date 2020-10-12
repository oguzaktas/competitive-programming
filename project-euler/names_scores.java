import java.util.Arrays;
import java.io.*;

class NamesScores {
    public static void main(String[] args)  throws FileNotFoundException, IOException {
        String filename = "/home/oguz/Downloads/GitHub/competitive-programming/project-euler/problem_22_names.txt";
        String[] names = readInput(filename);
        int result = 0;
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            result += (i + 1) * sum(names[i]);
        }
        System.out.println(result);
    }

    public static String[] readInput(String filename) {
        String names[] = null;
        try {
            File file = new File(filename);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str[] = br.readLine().split("\",\"");
            str[0] = str[0].replace("\"", "");
            str[str.length-1] = str[str.length-1].replace("\"", "");
            names = str;
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return names;
    }

    public static int sum(String name) {
        int result = 0;
        for (int i = 0; i < name.length(); i++) {
            result += (int) name.charAt(i) - 64;
        }
        return result;
    }
}