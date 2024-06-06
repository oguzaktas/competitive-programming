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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
        /* recursive solution
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return prev;
        */
    }
}

// https://leetcode.com/problems/reverse-linked-list/?envType=daily-question&envId=2024-03-21