// https://leetcode.com/problems/first-bad-version/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // Binary search
        int i = 1, j = n, mid = 0;
        
        while (i < j) {
            mid = i + (j - i) / 2;
            if (!isBadVersion(mid)) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        
        return i;
    }
}
