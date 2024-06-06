class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        while (i+1 < arr.length && arr[i] < arr[i+1]) {
            i++;
        }
        if (i == 0 || i == arr.length-1) {
            return false;
        }
        while (i+1 < arr.length && arr[i] > arr[i+1]) {
            i++;
        }
        return i == arr.length-1;
    }
}

// https://leetcode.com/explore/featured/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/