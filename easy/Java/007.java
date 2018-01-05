/*Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.*/

class Solution {
    public int reverse(int x) {
        int result = 0;
    
        while(x != 0) {
            int temp = x%10;
            int total = result * 10 + temp;
            if((total - temp) / 10 != result) return 0;
            result = total;
            x /= 10;
        }
        
        return result;
    }
}