class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] arr = s.toCharArray();
        int openCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                openCount++;
            } else if (arr[i] == ')') {
                if (openCount == 0) {
                    arr[i] = '*';
                } else {
                    openCount--;
                }
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '(' && openCount > 0) {
                arr[i] = '*';
                openCount--;
            }
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*') {
                arr[index] = arr[i];
                index++;
            }
        }
        return String.valueOf(arr).substring(0, index);
        /*
        char[] c = s.toCharArray();
        int count = 0;
        for (int ch : c) { // right-to-left
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                if (count > 0) {
                    count--;
                } else {
                    ch = 0;
                }
            }
        }
        count = 0;
        for (int i = c.length - 1; i >= 0; i--) { // left-to-right
            if (c[i] == '(') {
                count++;
            } else if (c[i] == ')') {
                if (count > 0) {
                    count--;
                } else {
                    c[i] = 0;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : c) {
            if (ch != 0) {
                sb.append(ch);
            }
        }
        return sb.toString();
        */
    }
}

// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/?envType=daily-question&envId=2024-04-06