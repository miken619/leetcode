/*Write a function to find the longest common prefix string amongst an array of strings.*/

//Solution

/*
Input:  String Array  Array of strings
Output: String        Common prefix among array
Description:          Return an empty string if the input is null or length is 0. Initialize a variable to the first string in the array. Compare that string 
                      with the rest of the string in the array. If an index of 0 can't be found remove the character in the end of the string and compare until
                      the index is found.
Time: O(n)
Space: O(1)
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        
        String pre = strs[0];
        
        for(int i = 1; i < strs.length; ++i) {
            while(strs[i].indexOf(pre) != 0) pre = pre.substring(0, pre.length() - 1);
        }
        
        return pre;
    }
}