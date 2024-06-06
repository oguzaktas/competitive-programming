class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String str = "123456789";
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                int current = Integer.parseInt(str.substring(i, j));
                if (current >= low && current <= high) {
                    result.add(current);
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}

// https://leetcode.com/problems/sequential-digits/?envType=daily-question&envId=2024-02-02