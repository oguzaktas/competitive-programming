class Solution {
    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        List<List<Integer>> answer = new ArrayList<>();
        for (int[] interval : intervals) {
            if (interval[0] > toBeRemoved[1] || interval[1] < toBeRemoved[0]) {
                answer.add(Arrays.asList(interval[0], interval[1]));
            } else {
                if (interval[0] < toBeRemoved[0]) {
                    answer.add(Arrays.asList(interval[0], toBeRemoved[0]));
                }
                if (interval[1] > toBeRemoved[1]) {
                    answer.add(Arrays.asList(toBeRemoved[1], interval[1]));
                }
            }
        }
        return answer;
    }
}

// https://leetcode.com/problems/remove-interval/