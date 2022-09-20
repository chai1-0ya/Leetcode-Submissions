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
    
    ListNode ln;
    
    public boolean isPalindrome(ListNode head) {
        ln = head;
        return pal(head);
    }
    
    public boolean pal(ListNode node){
        if(node==null){
            return true;
        }
        // node = node.next;
        boolean ans = pal(node.next);
        boolean check = true;
        if(ln.val == node.val)
            check = true;
        else
            check = false;
        ln = ln.next;
        return ans && check;
        
    }
}