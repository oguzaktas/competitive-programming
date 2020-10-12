from math import log10, floor, ceil

def fibonacci_digits(n):
    if n < 2:
        return 1
    ϕ = (1 + 5 ** 0.5) / 2
    return floor(n * log10(ϕ) - log10(5) / 2) + 1

def solve(k):
    if k < 2:
        return 1
    ϕ = (1 + 5 ** 0.5) / 2
    return ceil((k + log10(5) / 2 - 1) / log10(ϕ))
# Binet's formula: https://en.wikipedia.org/wiki/Fibonacci_number#Binet's_formula

if __name__ == '__main__':
    print(solve(1000))

''' Java code (not completed)
import java.math.BigInteger;

class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(getResult());
    }

    public static String getResult() {
        BigInteger i = BigInteger.TWO;
        while (true) {
            if(String.valueOf(fib(i)).length() == 1000) {
                return i.toString();
            }
            i.add(BigInteger.ONE);
        }
    }

    public static BigInteger fib(BigInteger n) {
        if (n.intValue() == 1 || n.intValue() == 0) {
            return n;
        }
        return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.TWO)));
    }
}
'''