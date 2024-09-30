class Solution {
    public String largestNumber(int[] nums) {
        String[] numStrings = Arrays.toString(nums).split("[\\[\\]]")[1].split(", ");
        Arrays.sort(numStrings, (a, b) -> (b + a).compareTo(a + b));
        // handle the case where the largest number is 0
        if (numStrings[0].equals("0")) {
            return "0";
        }
        // concatenate sorted strings to form the largest number
        StringBuilder largestNum = new StringBuilder();
        for (String s : numStrings) {
            largestNum.append(s);
        }
        return largestNum.toString();
    }
}

// https://leetcode.com/problems/largest-number/?envType=daily-question&envId=2024-09-18