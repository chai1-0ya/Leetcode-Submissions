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
    
    // ListNode t = null;
    
    public ListNode rotate(ListNode head, ListNode t){
        if(head == null)
            return t;
        ListNode x = head.next;
        head.next = t;
        t = head;
        head = x;
        return rotate(head, t);
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return null;
        ListNode ls = head;
        ListNode t = null;
        ListNode x = head;
        int n = 0;
        while(x != null){
            x = x.next;
            n++;
        }
        k = k%n;
        int c = n-k-1;
        while(c-->0){
            ls = ls.next;
        }
        t = ls.next;
        ls.next = null;
        ListNode a = null;
        head = rotate(head, a);
        a = null;
        t = rotate(t, a);
        ls = head;
        while(ls.next != null)
            ls = ls.next;
        ls.next = t;
        a = null;
        head = rotate(head,a);
        
        
        // System.out.println(n);
        return head;
    }
}