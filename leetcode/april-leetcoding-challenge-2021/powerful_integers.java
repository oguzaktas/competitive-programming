class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> result = new ArrayList<>();
        if (x == 1 && y == 1) {
            if (bound <= 1) {
                return result;
            }
            result.add(2);
            return result;
        } else if (x == 1) {
            int i = 0;
            while ((int) Math.pow(y, i) + 1 <= bound) {
                result.add((int) Math.pow(y, i) + 1);
                i++;
            }
            return result;
        } else if (y == 1) {
            int i = 0;
            while ((int) Math.pow(x, i) + 1 <= bound) {
                result.add((int) Math.pow(x, i) + 1);
                i++;
            }
            return result; 
        }
        for (int i = 0, j = 0; (int) Math.pow(x, i) <= bound; i++) {
            int sum = (int) Math.pow(x, i) + (int) Math.pow(y, j);
            while (sum <= bound) {
                if (!result.contains(sum)) {
                    result.add(sum);
                }
                j++;
                sum = (int) Math.pow(x, i) + (int) Math.pow(y, j);
            }
            j = 0;
        }
        Collections.sort(result);
        return result;
    }
}

// https://leetcode.com/explore/challenge/card/april-leetcoding-challenge-2021/597/week-5-april-29th-april-30th/3726/