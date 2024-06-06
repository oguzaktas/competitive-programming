class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (arr[nums[i]]) {
                return nums[i];
            }
            arr[nums[i]] = true;
        }
        return 0;
        /* Floyd's algorithm O(n) time complexity solution
        int pointer1 = nums[0], pointer2 = nums[0];
        do {
            pointer1 = nums[pointer1];
            pointer2 = nums[nums[pointer2]];
        } while (pointer1 != pointer2);
        pointer1 = nums[0];
        while (pointer1 != pointer2) {
            pointer1 = nums[pointer1];
            pointer2 = nums[pointer2];
        }
        return pointer2;
        */
        /* array as HashMap O(n) time complexity solution
        while (nums[0] != nums[nums[0]]) {
            int next = nums[nums[0]];
            nums[nums[0]] = nums[0];
            nums[0] = next;
        }
        return nums[0];
        */
        /* O(nlogn) time complexity sorting solution
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                return nums[i];
            }
        }
        return -1;
        */
    }
}

// https://leetcode.com/problems/find-the-duplicate-number/?envType=daily-question&envId=2024-03-24