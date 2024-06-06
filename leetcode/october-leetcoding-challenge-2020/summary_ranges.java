class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        if (nums.length == 0) {
            return result;
        }
        int start = nums[0], end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                String range = start == end ? "" + start : start + "->" + end;
                result.add(range);
                start = nums[i];
                end = nums[i];
            }
        }
        String range = start == end ? "" + start : start + "->" + end;
        result.add(range);
        return result;
    }
}

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/562/week-4-october-22nd-october-28th/3510/