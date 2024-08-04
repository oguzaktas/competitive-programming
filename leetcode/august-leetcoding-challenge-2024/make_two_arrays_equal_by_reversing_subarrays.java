class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target[i]) {
                return false;
            }
        }
        return true;
        /* frequency counting using a dictionary
        Map<Integer, Integer> arrFreq = new HashMap<>();
        for (int num : arr) {
            arrFreq.put(num, arrFreq.getOrDefault(num, 0) + 1);
        }
        for (int num : target) {
            if (!arrFreq.containsKey(num)) {
                return false;
            }
            arrFreq.put(num, arrFreq.get(num) - 1);
            if (arrFreq.get(num) == 0) {
                arrFreq.remove(num);
            }
        }
        return arrFreq.size() == 0;
        */
    }
}

// https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/?envType=daily-question&envId=2024-08-03