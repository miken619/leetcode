/*Determine whether an integer is a palindrome. Do this without extra space.
Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.*/

//Solution

/*
Input:   int      An integer
Output:  boolean  Whether the input is a palindrome
Description:      Compare half of the input to avoid integer overflow. Check if the input is negative(negative numbers can be palindrome due to the sign), and the modules for 0 
                  unless it's 0(a number doesn't start with 0). Moving along the input from right to left. At each digit use division and modulus to remove the digit and store it within
                  a variable. Once the return variable is larger than the input break out of the loop. In case of an odd length divide the return variable by 10 one more time.
Time: O(log(n))
Space: O(1)
*/
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x != 0 && x%10 == 0)) return false;
        int result = 0;
        
        while(x > result) {
            result =  result * 10 + x%10;
            x /= 10;
        }

        return result == x || result/10 == x;
    }
}