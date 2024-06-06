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
    public boolean isPalindrome(ListNode head) {
        // recursive solution
        if (head == null) {
            return true;
        }
        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);
        /* using ArrayList with two pointers
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int right = 0, left = list.size() - 1;
        while (right < left) {
            if (list.get(right) != list.get(left)) {
                return false;
            }
            right++;
            left--;
        }
        return true;
        */
    }
}

// https://leetcode.com/problems/palindrome-linked-list/?envType=daily-question&envId=2024-03-22