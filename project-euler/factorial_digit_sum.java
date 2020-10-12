import java.math.BigInteger;

class FactorialDigitSum {
    public static void main(String[] args) {
        System.out.println(getResult());
    }

    public static int getResult() {
        BigInteger j = BigInteger.ONE;
        for (int i = 2; i <= 100; i++) {
            j = j.multiply(BigInteger.valueOf(i));
        }
        String str = j.toString();
        int result = 0;
        for (char c : str.toCharArray()) {
            result += Character.getNumericValue(c);
        }
        return result;
    }
}

/* Python brute force solution;
import math
n = 100
print(sum(map(int, str(math.factorial(n)))))
*/