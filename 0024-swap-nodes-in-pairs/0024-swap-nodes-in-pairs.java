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
        ListNode temp = new ListNode(0);
        if(head == null)
            return null;
        temp.next = head;
        ListNode t = temp;
        while(temp.next!=null && temp.next.next!=null){
            ListNode a = temp.next;
            ListNode b = temp.next.next;
            a.next = b.next;
            b.next = a;
            temp.next = b;
            temp = temp.next.next;
        }
        return t.next;
    }
}