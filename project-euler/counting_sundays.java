import java.time.DayOfWeek;
import java.util.Date;

class CountingSundays {
    public static void main(String[] args) {
        System.out.println(countSundays());
    }

    public static int countSundays() {
        int result = 0;
        for (int i = 1901; i <= 2000; i++) {
            for (int j = 1; j <= 12; j++) {
                if (getDayOfWeek(i, j, 1) == 0) // Sunday
                {
                    result++;
                }
            }
        }
        return result;
    }
    
    public static int getDayOfWeek(int year, int month, int day) {
        long m = mod((long) month - 3, 4800);
        long y = mod(year + m / 12, 400);
        m %= 12;
        return (int) ((y + y / 4 - y / 100 + (13 * m + 2) / 5 + day + 2) % 7);
    }
    
    public static long mod(long x, long y) {
        x %= y;
        if (y > 0 && x < 0 || y < 0 && x > 0) {
            x += y;
        }
        return x;
    }
}