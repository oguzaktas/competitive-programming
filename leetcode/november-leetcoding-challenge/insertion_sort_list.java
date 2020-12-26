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
    ListNode result;
    
    public ListNode insertionSortList(ListNode head) {
        result = null;
        while (head != null) {
            ListNode next = head.next;
            sortedInsert(head);
            head = next;
        }
        return result;
    }
    
    public void sortedInsert(ListNode node) {
        if (result == null || result.val >= node.val) {
            node.next = result;
            result = node;
        } else {
            ListNode current = result;
            while (current.next != null && current.next.val < node.val) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
    }
}

// https://leetcode.com/explore/challenge/card/november-leetcoding-challenge/564/week-1-november-1st-november-7th/3517/

// https://www.geeksforgeeks.org/insertion-sort-for-singly-linked-list/#:~:text=Below%20is%20simple%20insertion%20sort,sorted%20(or%20result)%20list.