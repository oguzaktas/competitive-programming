class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() % k != 0) {
            sb.append(fill);
        }
        String result[] = new String[sb.length() / k];
        for (int i = 0; i < sb.length() / k; i++) {
            result[i] = sb.substring(i * k, (i + 1) * k);
        }
        return result;
    }
}

// https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/?envType=daily-question&envId=2025-06-22