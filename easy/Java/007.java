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
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.*/


//Solution

/*
Input:  int  An Integer
Output: int  The reverse digits of the input
Description: Moving along the input one digit at a time from right to left. At each digit removed it using division and use 
             modulus to access the remove digit. Build the return variable by first multiplying the variable by 10 and then  
             adding the remove digit. In order to check for Integer Overflow, before updating the return variable store it in
             a temporary variable and reverse the math operation done on it. Compare that temporary value to the return value,
             and if they're different an overflow happened and return 0 otherwise continue;
Time: O(log(n))
Space: O(1)

Note: -Use 10 as the denominator because the input is base 10 and that will allow us to move to the left 1 digit at a time. 
      -Multiply by 10 in order to place the digit in the correct position (i.e 0th, 10th, 100th, 1000th) 
*/

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