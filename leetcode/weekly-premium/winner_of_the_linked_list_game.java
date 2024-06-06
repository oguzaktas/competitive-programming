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
    public String gameResult(ListNode head) {
        ListNode even = head;
        int oddPoints = 0, evenPoints = 0;
        while (even != null) {
            ListNode odd = even.next;
            if (even.val > odd.val) {
                evenPoints += 1;
            } else {
                oddPoints += 1;
            }
            even = odd.next;
        }
        if (oddPoints > evenPoints) {
            return "Odd";
        } else if (oddPoints < evenPoints) {
            return "Even";
        } else {
            return "Tie";
        }
    }
}

// https://leetcode.com/problems/winner-of-the-linked-list-game/