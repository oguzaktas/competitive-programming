class Solution {
    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int count = 0;
        for (int num : arr) {
            if (set.contains(num+1)) {
                count++;
            }
        }
        return count;
    }
}

// https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/705/hashing/4661/