/*Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?*/

class 342 {
    public boolean isPowerOfFour(int num) {
        if(num > 0 && num == Math.pow(4, (int)(Math.log(num)/Math.log(4)))) return true;
        return false;
    }
}