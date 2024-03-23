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
    
    ListNode ls;
    
    public boolean isPalindrome(ListNode head) {
        ls = head;
        return pal(head);
    }
    
    public boolean pal(ListNode temp){
        if(temp == null)
            return true;
        boolean ans = pal(temp.next);
        if(ls.val==temp.val){
            ls = ls.next;
            return true&ans;
        }
        else return false;
    }
}