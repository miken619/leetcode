/*Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.*/


class 557 {
    public String reverseWords(String s) {
        String[] arrayStr = s.split(" ");
        for(int i = 0; i < arrayStr.length; ++i) {
            arrayStr[i] = reverseHelper(arrayStr[i].toCharArray());
        }      
        return String.join(" ", arrayStr);    
    }
    
    public String reverseHelper(char[] arr) {
        for(int i = 0, j = arr.length - 1; i < j; ++i, --j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return String.valueOf(arr);
    }
}
