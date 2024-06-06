class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }
        int[] counter = new int[26];
        int max = 0;
        for (int i = 0; i < tasks.length; i++) {
            counter[tasks[i] - 'A']++;
        }
        /*
        for (int i = 0; i < tasks.length; i++) {
            counter[tasks[i] - 'A']++;
            max = Math.max(max, counter[tasks[i] - 'A']);
        }
        int time = (max - 1) * (n + 1);
        for (int i : counter) {
            if (i == max) {
                time++;
            }
        }
        return Math.max(tasks.length, time);
        */
        int count = 0;
        for (int i : counter) {
            if (i > max) {
                max = i;
                count = 1;
            } else if (i == max) {
                count++;
            }
        }
        return Math.max(tasks.length, (max - 1) * (n + 1) + count);
        /* greedy approach solution
        int[] counter = new int[26];
        int max = 0, count = 0;
        for (int i = 0; i < tasks.length; i++) {
            counter[tasks[i] - 'A']++;
            if (max == counter[tasks[i] - 'A']) {
                count++;
            } else if (max < counter[tasks[i] - 'A']) {
                max = counter[tasks[i] - 'A'];
                count = 1;
            }
        }
        int partCount = max - 1;
        int partLength = n - (count - 1);
        int emptySlots = partCount * partLength;
        int availableTasks = tasks.length - max * count;
        int idles = Math.max(0, emptySlots - availableTasks);
        return tasks.length + idles;
        */
    }
}

// https://leetcode.com/problems/task-scheduler/?envType=daily-question&envId=2024-03-19