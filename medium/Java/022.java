/*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
*/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisUtil(result, "", 0, 0, n);
        return result;
    }
    
    public void generateParenthesisUtil(List<String> result, String str, int open, int close, int max) {
        if(str.length() == max * 2) {
            result.add(str);
            return;
        }
        
        if(open < max) {
            generateParenthesisUtil(result, str + "(", open + 1, close, max);
        }
        if(close < open) {
            generateParenthesisUtil(result, str + ")", open, close + 1, max);
        }
    }
}