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
      ListNode piya = null;
    public  void reverse(ListNode head , ListNode ls){
        if(head == null)
            return ;
        ListNode x = head.next;
        head.next = ls;
        ls = head;
        head = x;
        piya=ls;
        reverse(head,ls);
    }
    
    public  ListNode reverseList(ListNode head) {
       
        reverse(head, piya);
        return piya;
    }
}