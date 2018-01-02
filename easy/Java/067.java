/*Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".

*/

class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(i >= 0 || j >= 0) {
            int valA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int valB = (j >= 0) ? b.charAt(j--) - '0': 0;
            int total = valA + valB + carry;
            sb.append(total%2);
            carry = total/2;  
        }
        if(carry == 1) sb.append(carry);
        return sb.reverse().toString();
    }
}