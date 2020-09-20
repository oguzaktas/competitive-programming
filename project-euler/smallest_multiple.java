class SmallestMultiple {
    public static void main(String[] args) {
        boolean flag = true;
        int t = 0;
        while (flag) {
            t++;
            if (t % 11 == 0 && t % 12 == 0 && t % 13 == 0 && t % 14 == 0 && t % 15 == 0 && t % 16 == 0 && t % 17 == 0 && t % 18 == 0 && t % 19 == 0 && t % 20 == 0) {
                flag = false;
                System.out.println(t);
            }
        }
    }
}