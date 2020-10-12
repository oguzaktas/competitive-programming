class ReciprocalCycles {
    public static void main(String[] args) {
        System.out.println(getResult());
    }

    public static int getResult() {
        int sequenceLength = 0, result = 0;
        int value, position;
        for (int i = 1000; i > 1; i--) {
            if (sequenceLength >= i) {
                break;
            }
            int[] foundRemainders = new int[i];
            value = 1;
            position = 0;
            while (foundRemainders[value] == 0 && value != 0) {
                foundRemainders[value] = position;
                value *= 10;
                value %= i;
                position++;
            }
            if (position - foundRemainders[value] > sequenceLength) {
                sequenceLength = position - foundRemainders[value];
                result = i;
            }
        }
        return result;
    }
}

// https://projecteuler.net/problem=26