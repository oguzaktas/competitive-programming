class Solution {
    public int countElements(int[] arr) {
        List<Integer> nums = new ArrayList<Integer>(arr.length);
        for (int i : arr) {
			nums.add(Integer.valueOf(i));
		}
        int count = 0;
        for (int j : nums) {
            if (nums.contains(j+1)) {
                count++;
            }
        }
        return count;
    }
}
