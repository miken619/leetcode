/*Given two strings s1, s2, find the lowest ASCII sum of deleted characters to make two strings equal.

Example 1:
Input: s1 = "sea", s2 = "eat"
Output: 231
Explanation: Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.
Deleting "t" from "eat" adds 116 to the sum.
At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.
Example 2:
Input: s1 = "delete", s2 = "leet"
Output: 403
Explanation: Deleting "dee" from "delete" to turn the string into "let",
adds 100[d]+101[e]+101[e] to the sum.  Deleting "e" from "leet" adds 101[e] to the sum.
At the end, both strings are equal to "let", and the answer is 100+101+101+101 = 403.
If instead we turned both strings into "lee" or "eet", we would get answers of 433 or 417, which are higher.
Note:

0 < s1.length, s2.length <= 1000.
All elements of each string will have an ASCII value in [97, 122].*/

class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] matrix = new int[m + 1][n + 1];
        
        for(int i = 1; i <= m; ++i) {
            matrix[i][0] = matrix[i - 1][0] + s1.charAt(i -1); 
        }
        
        for(int j = 1; j <= n; ++j) {
            matrix[0][j] = matrix[0][j - 1] + s2.charAt(j -1); 
        }
        
        for(int i = 1; i <= m; ++i) {   
            for(int j = 1; j <= n; ++j) {             
              if(s1.charAt(i - 1) == s2.charAt(j - 1)) matrix[i][j] = matrix[i - 1][j - 1];  
              else {
                  matrix[i][j] = Math.min(s1.charAt(i - 1) + matrix[i - 1][j], s2.charAt(j - 1) + matrix[i][j - 1]);
                  matrix[i][j] = Math.min(matrix[i][j], s1.charAt(i - 1) + s2.charAt(j - 1) + matrix[i - 1][j - 1]);
              }
            }       
        }
        
        return matrix[m][n];
    }
}