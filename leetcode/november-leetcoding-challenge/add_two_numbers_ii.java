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
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode temp = new ListNode();
        ListNode p = temp;
        l1 = reverseLinkedList(l1);
        l2 = reverseLinkedList(l2);
        ListNode f = l1;
        ListNode s = l2;
        while (f.next != null || s.next != null) {
            if (f.next == null) {
                f.next = new ListNode(0);
            }
            if (s.next == null) {
                s.next = new ListNode(0);
            }
            f = f.next;
            s = s.next;
        }
        int carry = 0;
        while (l1 != null && l2 != null) {
            ListNode curr = new ListNode(l1.val + l2.val + carry);
            if (curr.val >= 10) {
                curr.val %= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            p.next = curr;
            if (l1.next == null && l2.next == null) {
                if (carry == 1) {
                    p.next.next = new ListNode(carry);
                }
            }
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        return reverseLinkedList(temp.next);
    }
    
    public ListNode reverseLinkedList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev; 
    }
}

// https://leetcode.com/explore/challenge/card/november-leetcoding-challenge/564/week-1-november-1st-november-7th/3522/

// https://leetcode.com/problems/add-two-numbers-ii/discuss/927384/JAVA-Reverse-Addition-Solution-(98.89)-With-Explanation-and-Easy-Understand