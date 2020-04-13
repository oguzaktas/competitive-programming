/* Lottery Coupons
There is a lottery with n coupons and n people take part in it. Each pearson picks exactly one coupon.
Coupons are numbered consecutively from 1 to n, n being the maximum ticket number. The winner of the lottery
is any person who owns a coupon where the sum of the digits on the coupon is equal to s. If there are multiple
winners, the prize is split equally among them. Determine how many values of s there are where there is
at least one winner and the prize is split among most people.

Example: 12 -> The list of coupon numbers generated from 1 to n and the sums of the digits are [1,2,3,4,5,6,7,8,9,1,2,3]
The largest number of winners is 2 which will occur for coupons numbered [1,10], [2, 11] and [3,12]. The maximum
number of possible winners occurs for any of these 3 possible values of s, so 3 is the answer.
n = 11 -> The lottery coupons are numbered from 1 to 11 and the sum of the digits of each of them is 1,2,3,4,5,6,7,8,1,2
respectively. [1,10] and [2,11] are two winners. So expected output is 2.

Constraints: 1 <= n <= 10^4
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author oguz
 */
public class LotteryCoupons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(calculateCoupons(11));
    }
    
    public static int calculateCoupons(int n) {
        int count = 0;
        List<Integer> sums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int temp = i;
            while (temp != 0) {
                sum += (temp % 10);
                temp /= 10;
            }
            sums.add(sum);
        }
        Collections.sort(sums);
        return mostFrequent(sums);
    }
    
    public static int mostFrequent(List<Integer> sums) {
        Collections.sort(sums);
        int maxCount = 1, res = sums.get(0);
        int currentCount = 1;
        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i) == sums.get(i - 1)) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    res = sums.get(i - 1);
                }
                currentCount = 1;
            }
        }
        if (currentCount > maxCount) {
            maxCount = currentCount;
            res = sums.get(sums.size() - 1);
        }
        return maxCount;
    }
    
}
