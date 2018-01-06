/*The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

Example 1:

Input: 1
Output: "1"
Example 2:

Input: 4
Output: "1211"*/

class 038 {
    public String countAndSay(int n) {
         if(n <= 0) return "";
        
         StringBuilder sb = new StringBuilder();
         StringBuilder row = new StringBuilder();
         sb.append("1");
         for(int i = 1; i < n; ++i) {
            row.setLength(0);
            char prev = sb.charAt(0);
            int count = 1;
            for(int j = 1; j < sb.length(); ++j) {
                char curr = sb.charAt(j);
                if (prev != curr) {  
                    row.append(count + "" + prev);
                    prev = curr;
                    count = 1;
                } else ++count;                   
            }
            sb.setLength(0);
            sb.append(row.toString() + count + prev);
         }       
         return sb.toString();
    }                
}
        