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
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int temp = list.get(k - 1);
        list.set(k - 1, list.get(list.size() - k));
        list.set(list.size() - k, temp);
        ListNode node = new ListNode(list.get(0));
        ListNode h = node;
        for (int i = 1; i < list.size(); i++) {
            ListNode l = new ListNode(list.get(i));
            node.next = l;
            node = l;
        }
        return h;
    }
}

// https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3671/