/*Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1*/

class Solution {
    public int strStr(String haystack, String needle) {
        int result = -1;
        int m = haystack.length(), n = needle.length();
        if(n == 0) return 0;
        
        for(int i = 0; i <= m - n; ++i) {
           for(int j = 0; j < n; ++j) {
               if(haystack.charAt(i + j) != needle.charAt(j)) break;
               if(j + 1 == n) return i;
           }  
        }
        
        return result;
    }
}