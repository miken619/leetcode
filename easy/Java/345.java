/*Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".*/

class Solution {
    public String reverseVowels(String s) {
        // Set<Character> set = new HashSet<>();
        // set.add('A');set.add('a');
        // set.add('E');set.add('e');
        // set.add('I');set.add('i');
        // set.add('O');set.add('o');
        // set.add('U');set.add('u');
        
        String vowels = "aeiouAEIOU";
        char[] chArray = s.toCharArray();
        int i = 0, j = chArray.length - 1;
        while(i <= j) {
            while(i <= j && vowels.indexOf(chArray[i]) == -1) ++i;
            while(i <= j && vowels.indexOf(chArray[j]) == -1) --j;
            if(i <= j) {
                char temp = chArray[i];
                chArray[i] = chArray[j];
                chArray[j] = temp;
                ++i;
                --j;
            }
        }
        
        return String.valueOf(chArray);
         
    }
}