class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answer = new ArrayList<>();  
        int[] count = new int[nums.length + 1];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 2) {
                answer.add(i);
            }
        }
        return answer;
        /*
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] < 0) {
                answer.add(Math.abs(nums[i]));
            }
            nums[Math.abs(nums[i]) - 1] *= -1;
        }
        return answer;
        */
    }
}

// https://leetcode.com/problems/find-all-duplicates-in-an-array/?envType=daily-question&envId=2024-03-25s