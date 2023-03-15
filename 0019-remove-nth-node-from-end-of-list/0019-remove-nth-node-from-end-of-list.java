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
        ListNode temp = head;
        int i = 0;
        while(temp != null){
            i++;
            temp = temp.next;
        }
        n = i-n;
        temp = head;
        if(n==0)
            return head.next;
        for(int j=0;j<i;j++){
            if(j==n-1){
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        // System.out.println(i);
        return head;
    }
}