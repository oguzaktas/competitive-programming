class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> firstRow = Arrays.asList(1);
        result.add(firstRow);
        List<Integer> currentRow;
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currentRow.add(1);
            result.add(currentRow);
        }
        return result;
    }
}

// https://leetcode.com/problems/pascals-triangle/?envType=daily-question&envId=2021-06-21