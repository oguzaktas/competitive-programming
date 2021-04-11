class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0 || envelopes[0] == null || envelopes[0].length != 2) {
            return 0;
        }
        Arrays.sort(envelopes, new Comparator<int[]>(){
            public int compare(int[] arr1, int[] arr2) {
                if (arr1[0] == arr2[0]) {
                    return arr2[1] - arr1[1];
                } else {
                    return arr1[0] - arr2[0];
                }
            }
        });
        int[] dp = new int[envelopes.length];
        int length = 0;
        for (int[] envelope : envelopes) {
            int index = Arrays.binarySearch(dp, 0, length, envelope[1]);
            if (index < 0) {
                index = -(index + 1);
            }
            dp[index] = envelope[1];
            if (index == length) {
                length++;
            }
        }
        return length;
    }
}

// https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/592/week-5-march-29th-march-31st/3690/