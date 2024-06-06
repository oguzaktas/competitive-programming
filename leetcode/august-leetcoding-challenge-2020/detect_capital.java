class Solution {
    public boolean detectCapitalUse(String word) {
        char[] arr = word.toCharArray();
        if (arr.length == 1)
            return true;
        if (arr[0] >= 'A' && arr[0] <= 'Z') {
            if (arr[1] >= 'A' && arr[1] <= 'Z') {
                for (int i = 2; i < arr.length; i++) {
                    if (arr[i] >= 'a' && arr[i] <= 'z') {
                        return false;
                    }
                }
                return true;
            } else {
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] >= 'A' && arr[i] <= 'Z') {
                        return false;
                    }
                }
                return true;
            }
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] >= 'A' && arr[i] <= 'Z') {
                    return false;
                }
            }
            return true;
        }
    }
}

// https://leetcode.com/explore/featured/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3409
// https://leetcode.com/articles/detect-capital/