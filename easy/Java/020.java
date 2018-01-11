/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.*/


//Solution

/*

*/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char ch: s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            else if(!stack.isEmpty()){
                char temp = stack.pop();
                if(temp == '(' && ch != ')' || temp == '{' && ch != '}' || temp == '[' && ch != ']') return false;
            }else return false;
        }
        
        return stack.isEmpty();
    }
}