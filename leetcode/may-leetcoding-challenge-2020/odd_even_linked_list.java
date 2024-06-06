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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode root = head;
        ListNode oddCounter = head;
        ListNode evenCounter = oddCounter.next;
        ListNode even = evenCounter;

        while (oddCounter.next != null && oddCounter.next.next!=null) {
            oddCounter.next = evenCounter.next;
            oddCounter = oddCounter.next;
            evenCounter.next = oddCounter.next;
            evenCounter=evenCounter.next;
        }
        oddCounter.next = even;
        return root;  
    }
}

// https://leetcode.com/problems/odd-even-linked-list/