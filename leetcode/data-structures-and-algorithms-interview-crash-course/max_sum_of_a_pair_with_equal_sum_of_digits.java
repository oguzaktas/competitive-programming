class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = -1;
        for (int num : nums) {
            // int digitSum = String.valueOf(num).chars().map(Character::getNumericValue).sum();
            int digitSum = getDigitSum(num);
            if (!map.containsKey(digitSum)) {
                map.put(digitSum, num);
            } else {
                result = Math.max(result, map.get(digitSum) + num);
                map.put(digitSum, Math.max(map.get(digitSum), num));
            }
        }
        return result;
    }

    private int getDigitSum(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}

// https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/