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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t = new ListNode(0);
        t.next = head;
        ListNode current = t;
        while (current.next != null && current.next.next != null) {
            if (current.next.val == current.next.next.val) {
                int duplicate = current.next.val;
                while (current.next != null && current.next.val == duplicate) {
                    current.next = current.next.next;
                }
            } else {
                current = current.next;
            }
        }
        return t.next;
    }
}

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3593/