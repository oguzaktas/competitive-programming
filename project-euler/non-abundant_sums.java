import java.util.ArrayList;

class NonAbundantSums {
    public static void main(String[] args) {
        System.out.println(getResult());
    }

    public static int findDivisors(int n) {
        int sqrt = (int) Math.sqrt(n);
        int sum = 1;
        if (n == sqrt * sqrt) {
            sum += sqrt;
            sqrt--;
        }
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                sum = sum + i + (n / i);
            }
        }
        return sum;
    }

    public static ArrayList<Integer> findAbundantNumbers() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 12; i < 28111; i++) {
            if (findDivisors(i) > i) {
                result.add(i);
            }
        }
        return result;
    }

    public static int getResult() {
        int result = 0;
        boolean temp;
        ArrayList<Integer> abundantNumbers = findAbundantNumbers();
        for (int i = 1; i < 28123; i++) {
            temp = false;
            for (int k = 0;  k < abundantNumbers.size() - 1; k++) {
                    if (abundantNumbers.get(k) >= i) {
                        break;
                    }
                    for (int l = k; l < abundantNumbers.size(); l++) {
                        if (abundantNumbers.get(l) >= i) {
                            break;
                        }
                        if (abundantNumbers.get(k) + abundantNumbers.get(l) == i) {
                            temp = true;
                            break;
                        }
                    }
                if (temp) {
                    break;
                }
            }
            if (!temp) {
                result += i;
            }
        }
        return result;
    }
}

// https://projecteuler.net/problem=23