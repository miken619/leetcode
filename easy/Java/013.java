/*Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

*/


//Solution

/*
Input:  String   A string of roman numeral
Output: int      integer representing the input
Description :    Use a Map to map the roman numeral to its' integer value for constant access. Iterate from right to left of the input.
                 Check if character at i is less the than i - 1, subtract if true, add otherwise. Set prev variable to curr character and 
                 iterator again.
Time: O(n);
Space: O(n)
*/

class Solution {
    public int romanToInt(String s) {
       Map<Character, Integer> map = new HashMap<Character, Integer>();
       map.put('I', 1); map.put('V', 5);
       map.put('X', 10); map.put('L', 50);
       map.put('C', 100); map.put('D', 500);
       map.put('M', 1000);
       
       int result = 0;
       int prev = Integer.MIN_VALUE;
       
       for(int i = s.length() - 1; i >=0; --i) {
           int value = map.get(s.charAt(i));
           
           if(value < prev) result -= value;
           else result += value;
               
           prev = value;
       }
       
       return result;
   }
}