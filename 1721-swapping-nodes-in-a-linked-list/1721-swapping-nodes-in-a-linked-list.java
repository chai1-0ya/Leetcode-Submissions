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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode ls = head;
        int n = 0;
        int c = 0, x = 0;
        while(ls != null){
            n++;
            if(n==k)
                c = ls.val;
            ls = ls.next; 
        }
        int t = n-k;
        ls = head;
        while(true){
            x++;
            if(x==t+1){
                x = ls.val;
                ls.val = c;
                break;
            }
            ls = ls.next;
        }
        ls = head;
        for(int i=1;i<=n;i++){
            if(i==k)
                ls.val = x;
            ls = ls.next;
        }
        // System.out.println(n);
        return head;
    }
}