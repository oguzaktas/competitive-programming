class Solution {
    public int distributeCandies(int[] candyType) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : candyType) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return candyType.length / 2 > map.size() ? map.size() : candyType.length / 2;
    }
}

// https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3657/