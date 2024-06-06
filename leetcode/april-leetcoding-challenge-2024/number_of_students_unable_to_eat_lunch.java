class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circleCount = 0, squareCount = 0;
        for (int i : students) {
            if (i == 0) {
                circleCount++;
            } else {
                squareCount++;
            }
        }
        for (int j : sandwiches) {
            if (j == 0 && circleCount == 0) {
                return squareCount;
            }
            if (j == 1 && squareCount == 0) {
                return circleCount;
            }
            if (j == 0) {
                circleCount--;
            } else {
                squareCount--;
            }
        }
        return 0;
    }
}

// https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/?envType=daily-question&envId=2024-04-08