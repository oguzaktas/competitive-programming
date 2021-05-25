class Solution {
    public int minMoves2(int[] nums) {
        int result = 0;
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == list.get(list.size() / 2)) {
                continue;
            } else {
                result += Math.abs(list.get(list.size() / 2) - list.get(i));
            }
        }
        return result;
    }
}

// https://leetcode.com/explore/challenge/card/may-leetcoding-challenge-2021/600/week-3-may-15th-may-21st/3748/