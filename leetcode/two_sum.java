class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return null;
    }

    /*
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 17;
        System.out.println(twoSum(nums, target));
    }
    */
}