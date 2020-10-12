class AmicableNumbers {
    public static void main(String[] args) {
        System.out.println(getResult());
    }

    public static int getResult() {
        int result = 0;
        int sum1, sum2;
        for (int i = 2; i <= 10000; i++) {
            sum1 = findDivisors(i);
            if (sum1 > i && sum1 <= 10000) {
                sum2 = findDivisors(sum1);
                if (sum2 == i) {
                    result += i + sum1;
                }
            }
        }
        return result;
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
}