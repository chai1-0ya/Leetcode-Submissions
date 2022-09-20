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
    
    ListNode ln  = new ListNode(-1);
    
    public boolean isPalindrome(ListNode head) {
        ln = ln.next;
        ln = head;
        return pal(head);
    }
    
    public boolean pal(ListNode node){
        if(node==null){
            return true;
        }
        boolean ans = pal(node.next);
        boolean check = (ln.val == node.val)? true : false; 
        ln = ln.next;
        return ans && check;
        
    }
}