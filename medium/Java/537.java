/*Given two strings representing two complex numbers.

You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

Example 1:
Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
Example 2:
Input: "1+-1i", "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
Note:

The input strings will not have extra blank.
The input strings will be given in the form of a+bi, where the integer a and b will both belong to the range of [-100, 100]. And the output should be also in this form.
*/

class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] arrayA = a.split("\\+");
        String[] arrayB = b.split("\\+");
        
        int a1 = Integer.parseInt(arrayA[0]);
        int b1 = Integer.parseInt(arrayA[1].replace("i", ""));
        
        int a2 = Integer.parseInt(arrayB[0]);
        int b2 = Integer.parseInt(arrayB[1].replace("i", ""));
        
        int a1a2 = a1 * a2;
        int b1b2 = b1 * b2;
        int a1b2b1a2 = a1 * b2 + b1 * a2;
        
        return (a1a2 - b1b2) + "+" + a1b2b1a2 + "i";
    }
}