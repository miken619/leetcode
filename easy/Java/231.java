/*Given an integer, write a function to determine if it is a power of two.*/

class 231 {
  public boolean isPowerOfTwo(int n) {
      //return (n > 0 && n == Math.pow(2, (int)(Math.log(n)/Math.log(2))));
      return (n > 0 && Integer.bitCount(n) == 1);
  }
}