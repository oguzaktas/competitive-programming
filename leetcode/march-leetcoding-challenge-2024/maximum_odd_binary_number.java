class Solution {
    public String maximumOddBinaryNumber(String s) {
        // StringBuilder O(n) solution
        int count1 = 0, count0 = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count1++;
            } else {
                count0++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count1 - 1; i++) {
            result.append('1');
        }
        for (int i = 0; i < count0; i++) {
            result.append('0');
        }
        result.append('1');
        return result.toString();
        /* bit manipulation, one pass with two pointers
        if (s.length() == 1) {
            return s;
        }
        char[] arr = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (arr[left] == '1') {
                left++;
            }
            if (arr[right] == '0') {
                right--;
            }
            if (left <= right && arr[left] == '0' && arr[right] == '1') {
                arr[left] = '1';
                arr[right] = '0';
            }
        }
        arr[left-1] = '0';
        arr[s.length()-1] = '1';
        return new String(arr);
        */
    }
}

// https://leetcode.com/problems/maximum-odd-binary-number/?envType=daily-question&envId=2024-03-01