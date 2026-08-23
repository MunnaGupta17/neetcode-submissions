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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
         ListNode previous = null;
         ListNode temp = head;
         int length = 0;
         while(temp != null){
            length++;
            temp = temp.next;
         }
         int pivot = length-n;
         n = pivot;
         temp = head;
         while(temp != null){
            n--;
            if(n == -1){
                if(previous == null) return head.next;
                if(head.next == null) return previous;
                previous.next = temp.next;
                return head;
            }else{
                previous = temp;

                temp = temp.next;
            }
         }
         return null;
    }
}
