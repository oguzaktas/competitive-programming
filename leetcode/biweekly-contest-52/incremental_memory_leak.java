class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int[] result = new int[3];
        int step = 0;
        int second = 1;
        while (true) {
            if (memory1 >= memory2) {
                if (memory1 >= second) {
                    step++;
                    memory1 -= second;
                } else {
                    step++;
                    break;
                }
            } else {
                if (memory2 >= second) {
                    step++;
                    memory2 -= second;
                } else {
                    step++;
                    break;
                }
            }
            second++;
        }
        result[0] = step;
        result[1] = memory1;
        result[2] = memory2;
        return result;
    }
}

// https://leetcode.com/contest/biweekly-contest-52/problems/incremental-memory-leak/