/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rtn = new ListNode((l1.val + l2.val) % 10);
        ListNode p = rtn;
        int r = (l1.val + l2.val) / 10;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null || l2 != null) {
            p.next = new ListNode(r);
            p = p.next;
            if (l1 != null) {
                p.val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                p.val += l2.val;
                l2 = l2.next;
            }
            r = p.val / 10;
            p.val %= 10;
        }
        if (r > 0) {
            p.next = new ListNode(r);
        }
        return rtn;
    }
}

// https://leetcode.com/problems/add-two-numbers/

/* Java solution (Not completed: parseInt() RuntimeError);
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String number1 = "", number2 = "";
        while (l1 != null) {
            number1 += l1.val;
            l1 = l1.next;
        }
        while (l2 != null) {
            number2 += l2.val;
            l2 = l2.next;
        }
        String s = String.valueOf(Integer.valueOf(number1) + Integer.valueOf(number2));
        ListNode result = new ListNode(Integer.valueOf(s.charAt(0)));
        ListNode temp = result;
        for (int i = 1; i < s.length(); i++) {
            temp.next = new ListNode(Integer.valueOf(s.charAt(i)));
            temp = temp.next;
        }
        return result;
    }
}
*/