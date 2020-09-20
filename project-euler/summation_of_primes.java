class SummationOfPrimes {
    public static void main(String[] args) {
        System.out.println(sumOfPrimes(2000000));
    }

    public static long sumOfPrimes(long max) {
        long sum = 0;
        long prime = 1;
        int flag = 0;
        while (prime < max) {
            prime++;
            long s = (long) Math.sqrt(prime);
            flag = 0;
            while (s > 0) {
                if (prime % s == 0) {
                    flag++;
                }
                if (flag > 2) {
                    s = 0;
                }
                s--;
            }
            if (flag == 1) {
                sum += prime;
            }
        }
        return sum;
    }
}