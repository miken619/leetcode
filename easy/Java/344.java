/*Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh". */


class 344 {
    public String reverseString(String s) {
        String[] arr = s.split("");
        int i = 0, j = arr.length - 1;
        while(i < j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            ++i;
            --j;
        }
        return String.join("", arr);
        
    }
}