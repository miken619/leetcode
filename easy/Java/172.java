/*Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.*/

class 172 {
    public int trailingZeroes(int n) {
        int result = 0;
        while(n > 0) {
            n /= 5;
            result += n;
        }
        return result;
    }
}