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
        if (head == null)
            return null;
        ListNode previous = null;
        while (head != null) {
            // System.out.println(head.val);
            ListNode next = head.next;
            ListNode temp = head;
            temp.next = previous;
            previous = temp;
            head = next;
        }
        return previous;
    }
}
