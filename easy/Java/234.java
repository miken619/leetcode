/*Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        
        Stack<ListNode> stack = new Stack<>();
        ListNode ptr = head;
        while(ptr != null) {
            stack.push(ptr);
            ptr = ptr.next;
        }
        ptr = stack.pop();
        while(!stack.isEmpty() && head != ptr) {
            if(head.val != ptr.val) return false;
            ptr = stack.pop();
            head = head.next;
        }
        return true;
    }
}