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
    
    // public reverse(List)
    // ListNode ls = new ListNode();
    public ListNode reverseList(ListNode head) {
        ListNode ls = null;
        while(head != null){
            ListNode x = head.next;
            head.next = ls;
            ls = head;
            head = x;
        }
        return ls;
    }
}