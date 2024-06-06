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
    public ListNode frequenciesOfElements(ListNode head) {
        Map<Integer, ListNode> frequencies = new HashMap<>();
        ListNode current = head, freqHead = null;
        while (current != null) {
            if (frequencies.containsKey(current.val)) {
                ListNode frequencyNode = frequencies.get(current.val);
                frequencyNode.val += 1;
            } else {
                ListNode newFrequencyNode = new ListNode(1, freqHead);
                frequencies.put(current.val, newFrequencyNode);
                freqHead = newFrequencyNode;
            }
            current = current.next;
        }
        return freqHead;
        /*
        Map<Integer, Integer> map = new HashMap<>();
        while (head != null) {
            map.put(head.val, map.getOrDefault(head.val, 0) + 1);
            head = head.next;
        }
        List<Integer> list = new ArrayList<>(map.values());
        System.out.println(list);
        ListNode node = new ListNode(list.get(0));
        ListNode current = node;
        for (int i = 1; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return node;
        */
    }
}

// https://leetcode.com/problems/linked-list-frequency/