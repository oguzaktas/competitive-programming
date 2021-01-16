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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ArrayList<Integer> nodeElements = new ArrayList<Integer>();
        while (l1 != null) {
            nodeElements.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            nodeElements.add(l2.val);
            l2 = l2.next;
        }
        Collections.sort(nodeElements);
        ListNode result = new ListNode(nodeElements.get(0));
        ListNode node = result;
        for (int i = 1; i < nodeElements.size(); i++) {
            result.next = new ListNode(nodeElements.get(i));
            result = result.next;
        }
        return node;
    }
}

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3592/

/*
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        return head.next;
    }
}
*/