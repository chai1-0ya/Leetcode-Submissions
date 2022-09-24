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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ln = list1;
        ListNode ll = new ListNode();
        int n = 1;
        while(list1.next != null){
            if(n <= b)
                list1 = list1.next;
            // System.out.println(n+" "+list1.val);
            if(n==b){
                ll = list2;
                while(list2.next != null)
                    list2 = list2.next;
                list2.next = list1.next;
                break;
            }
            n++;
        }
        list1 = ln;
        n = 1;
        while(list1.next != null){
            if(n<a)
                list1 = list1.next;
            if(n==a){
                list1.next = ll;
                break;
            }
            n++;
        }
        return ln;
        
    }
}