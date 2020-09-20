class PythagoreanTriplet {
    public static void main(String[] args) {
        findResult();
    }

    public static void findResult() {
        for (long i = 2; i < 500; i++) {
            for (long j = 2; j < 500; j++) {
                for (long k = 2; k < 500; k++) {
                    if ((k * k + j * j == i * i) && (j < k) & (i + j + k == 1000) & i != j & i != k) {
                        System.out.println(i * j * k);
                    }
                }
            }
        }
    }
}