class Solution2 {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        System.out.println(numSubarrayProductLessThanK(nums, 100));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int result = 0;
        int temp = 1, j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > k) {
                j = i + 1;
                temp = 1;
            } else {
                result++;
                temp *= nums[i];
                while (temp >= k && j <= i) {
                    temp /= nums[j];
                    j++;
                }
                result += i - j;
            }
        }
        return result;
    }
}