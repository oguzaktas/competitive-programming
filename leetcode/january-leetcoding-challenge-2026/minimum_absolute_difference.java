class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // O(n) solution using counting sort
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int range = max - min + 1;
        boolean[] present = new boolean[range];
        for (int num : arr) {
            present[num - min] = true;
        }
        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        int prev = -1;
        for (int i = 0; i < range; i++) {
            if (present[i]) {
                if (prev != -1) {
                    int diff = i - prev;
                    if (diff < minDiff) {
                        minDiff = diff;
                        result.clear();
                        result.add(Arrays.asList(prev + min, i + min));
                    } else if (diff == minDiff) {
                        result.add(Arrays.asList(prev + min, i + min));
                    }
                }
                prev = i;
            }
        }
        return result;

        /* O(nlogn) solution
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < min) {
                min = arr[i + 1] - arr[i];
                result.clear();
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (arr[i + 1] - arr[i] == min) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return result;
        */
    }
}

// https://leetcode.com/problems/minimum-absolute-difference/?envType=daily-question&envId=2026-01-26