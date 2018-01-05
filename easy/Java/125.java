/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

*/

class Solution {
    public boolean isPalindrome(String s) {
        int head = 0, tail = s.length() - 1;
        
        while(head < tail) {
            char chHead = s.charAt(head);
            char chTail = s.charAt(tail);
            if(!Character.isLetterOrDigit(chHead)) ++head;
            else if(!Character.isLetterOrDigit(chTail)) --tail;
            else if(Character.toLowerCase(chHead) != Character.toLowerCase(chTail)) return false;
            else {
                ++head;
                --tail;
            }
        }
        
        return true;
    }
}