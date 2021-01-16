class Solution {
    public int findKthPositive(int[] arr, int k) {
        boolean flag = false;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= arr[arr.length - 1]; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    flag = true;
                }
            }
            if (!flag) {
                list.add(i);
                flag = false;
            }
            flag = false;
        }
        if (list.size() < k) {
            int temp = arr[arr.length - 1];
            while (list.size() < k) {
                list.add(++temp);
            }
        }
        return list.get(k - 1);
    }
}

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3594/