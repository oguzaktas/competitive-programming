class Solution2 {
    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
    }

    public static int bitwiseComplement(int N) {
        int result = 0;
        if (N == 0) {
            return 1;
        }
        if (N == 1) {
            return 0;
        }
        String binary = Integer.toBinaryString(N);
        for (int i = binary.length() - 1, j = 0; i >= 0; i--, j++) {
            if (binary.charAt(i) == '1') {
                result += 0 * Math.pow(2, j);
            } else {
                result += 1 * Math.pow(2, j);
            }
        }
        return result;
    }
}