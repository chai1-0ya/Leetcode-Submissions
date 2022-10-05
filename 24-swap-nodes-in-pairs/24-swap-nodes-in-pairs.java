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
    public ListNode swapPairs(ListNode head) {
        if(head == null)
            return null;
        ListNode ls = new ListNode(0);
        ls.next = head;
        ListNode dummy = ls;
        while(ls.next != null && ls.next.next != null){
            ListNode f = ls.next;
            ListNode s = ls.next.next;
            f.next = s.next;
            ls.next = s;
            ls.next.next = f;
            ls = ls.next.next;
            // break;
            
        }
        return dummy.next;
    }
}