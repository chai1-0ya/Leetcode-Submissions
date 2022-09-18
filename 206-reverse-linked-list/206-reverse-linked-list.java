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
    
    public ListNode reverse(ListNode head , ListNode ls){
        if(head == null)
            return ls;
        ListNode x = head.next;
        head.next = ls;
        ls = head;
        head = x;
        return reverse(head,ls);
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode ls = null;
        return reverse(head, ls);
        // return ls;
    }
}