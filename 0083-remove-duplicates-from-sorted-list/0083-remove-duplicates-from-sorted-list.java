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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null){
            ListNode x = temp.next;
            while(x != null && x.val==temp.val){
                x = x.next;
            }
            temp.next = x;
            temp = temp.next;
        }
        return head;
    }
}