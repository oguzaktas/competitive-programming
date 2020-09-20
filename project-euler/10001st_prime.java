class Prime {
    public static void main(String[] args) {
        System.out.println(findPrime());
    }

    public static long findPrime() {
        int counter = 0;
        int number = 3;
        boolean isPrime = false;
        long storedPrime = 0;
        for (int i = 2; ; i++) {
            if (i < number) {
                if (number % i == 0) {
                    number++;
                    i = 1;
                    continue;
                } else {
                    isPrime = true;
                    if (isPrime == true && (number - i) == 1) {
                        counter++;
                        storedPrime = number;
                        number++;
                        i = 1;
                    }
                }
            }
            if (counter == 10000) {
                return storedPrime;
            }
        }
    }
}