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
        ListNode ll = list2;
        ListNode lm = list1;
        int n = 1;
        while(list1.next != null){
//             {
//                 list1 = list1.next;
                
//             }
            if(n <= b){
                list1 = list1.next;
                if(n<a)
                    lm = list1;
            }
            // System.out.println(n+" "+list1.val);
            if(n==b){
                // ll = list2;
                while(list2.next != null)
                    list2 = list2.next;
                list2.next = list1.next;
                break;
            }
            n++;
        }
        // list1 = ln;
        // n = 1;
        lm.next = ll;
//         while(list1.next != null){
            
//                 list1 = list1.next;
//             if(n==a){
//                 list1.next = ll;
//                 break;
//             }
//             n++;
//         }
        return ln;
        
    }
}