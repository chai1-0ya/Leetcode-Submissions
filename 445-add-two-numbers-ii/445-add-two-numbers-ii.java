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
    
    public ListNode reverse(ListNode head, ListNode head1){
        if(head==null)
            return head1;
        ListNode x = head.next;
        head.next = head1;
        head1 = head;
        head = x;
        return reverse(head,head1);
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l11 = null;
        ListNode l22 = null;
        l1 = reverse(l1,l11);
        l2 = reverse(l2,l22);
        // while(l1 != null){
        //     System.out.println(l1.val);
        //     l1 = l1.next;
        // }
        // l1 = l2;
        int c = 0;
        l11 = new ListNode(0);
        l22 = l11;
        while(l1 != null || l2 != null){
            int x = 0;
            int y = 0;
            if(l1!=null)
                x = l1.val;
            else x = 0;
            if(l2!=null)
                y = l2.val;
            else 
                y = 0;
            int s = x+y+c;
            c = s/10;
            l11.next = new ListNode(s%10);
            System.out.println(l11.next.val);
            l11 = l11.next;// = new ListNode();
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
        }
        if(c>0)
            l11.next = new ListNode(c);
        l11 = null;
        l22 = l22.next;
        return reverse(l22,l11);
    }
}