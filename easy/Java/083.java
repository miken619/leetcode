/*Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode deleteDuplicates(ListNode head) {
//         if(head == null || head.next == null) return head;
      
//         ListNode currPtr = head.next;
//         ListNode prevPtr = head;
      
//         while(currPtr != null) {
//             if(prevPtr.val == currPtr.val) {
//                 ListNode temp = currPtr;
//                 prevPtr.next = currPtr.next;
//                 currPtr = currPtr.next;
//                 temp.next = null;
              
//             } else {
//                 prevPtr = currPtr;
//                 currPtr = currPtr.next;
//             }
          
          
//         }
      
//         return head;
      
      if(head == null || head.next == null) return head;   
      head.next = deleteDuplicates(head.next);
      if(head.val == head.next.val) {
        ListNode temp = head.next;
        head.next = null;
        return temp;
      }
      
      return head;
      
     // return head.val == head.next.val ? head.next : head;
  }
}