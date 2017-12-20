/*Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]*/

class 541 {
    public String reverseStr(String s, int k) {
        char[] chArray = s.toCharArray();
        int length = chArray.length;
        
        for(int i = 0; i < length; i += 2*k) {
            int val = Math.min(i + k - 1, length - 1);
            swap(chArray, i, val);      
        }
        
        return String.valueOf(chArray);
    }
    
    public void swap(char[] arr, int i, int j){
        while(i < j) {
            char ch = arr[i];
            arr[i] = arr[j];
            arr[j] = ch;
            ++i;
            --j;
        }
    }
}