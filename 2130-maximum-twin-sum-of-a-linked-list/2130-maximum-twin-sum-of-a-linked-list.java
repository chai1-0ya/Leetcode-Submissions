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
    public int pairSum(ListNode head) {
        ListNode half = head;
        int n = 1;
        while(half.next!=null){
            half = half.next;
            n++;
        }
        half = null;
        ListNode temp = head;
        int t = 1;
        // System.out.println(temp);
        while(temp != null){
            if(t<n/2)
                temp = temp.next;
            t++;
            // System.out.println(t);
            if(t >= n/2){
                ListNode x = temp.next;
                temp.next = half;
                half = temp;
                temp = x;
                // System.out.println(temp.val);
                // return t;
            }
        }
        // while(half.next != null){
        //     System.out.println(half.val);
        //     half = half.next;}
        t = 0;
        while(half.next != null){
            t = Math.max(t, head.val + half.val);
            head = head.next;
            half = half.next;
        }
        return t;
    }
}