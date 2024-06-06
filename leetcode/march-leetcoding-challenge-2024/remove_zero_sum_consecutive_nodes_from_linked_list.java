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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode front = new ListNode(0, head);
        ListNode current = front;
        int prefixSum = 0;
        Map<Integer, ListNode> prefixSumNode = new HashMap<>();
        while (current != null) {
            prefixSum += current.val;
            if (prefixSumNode.containsKey(prefixSum)) {
                ListNode prev = prefixSumNode.get(prefixSum);
                current = prev.next;
                int p = prefixSum + current.val;
                while (p != prefixSum) {
                    prefixSumNode.remove(p);
                    current = current.next;
                    p += current.val;
                }
                prev.next = current.next;
            } else {
                prefixSumNode.put(prefixSum, current);
            }
            current = current.next;
        }
        return front.next;
    }
}

// https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/?envType=daily-question&envId=2024-03-12