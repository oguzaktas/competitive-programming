class KthLargest {

    int k;
    List<Integer> nums;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = new ArrayList<Integer>(nums.length);
        for (int num : nums) {
            this.nums.add(num);
        }
        Collections.sort(this.nums);
    }
    
    public int add(int val) {
        int index = binarySearch(val);
        this.nums.add(index, val);
        return this.nums.get(this.nums.size() - k);
    }

    private int binarySearch(int val) {
        int left = 0, right = this.nums.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midElement = this.nums.get(mid);
            if (midElement == val) {
                return mid;
            } else if (midElement > val) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

 // https://leetcode.com/problems/kth-largest-element-in-a-stream/?envType=daily-question&envId=2024-08-12