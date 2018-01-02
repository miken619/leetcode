/*Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
//         while(head != null && head.val == val) {
//             ListNode temp = head;
//             head = head.next;
//             temp.next = null;
//         }
//         ListNode curr = head;
//         while(curr != null && curr.next != null) {
//             if(curr.next.val == val) {
//                 ListNode temp = curr.next;
//                 curr.next = curr.next.next;
//                 temp.next = null;
//             }else curr = curr.next;
//         }
        
//         return head;
        
        if(head == null) return null;
        
        head.next = removeElements(head.next, val);
        return (head.val == val) ? head.next : head;
    }
}