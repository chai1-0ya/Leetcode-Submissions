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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null && count<k) {
            temp = temp.next;
            count++;
        }
        if(count<k) return head; 
        int n = k;
        ListNode tail = head;                
        ListNode front = reverse(head,n);
        tail.next = reverseKGroup(temp,n);        
        return front;
    }

    private ListNode reverse(ListNode head,int k){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head;  
        while(k--!=0){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}