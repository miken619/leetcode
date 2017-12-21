/*Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.*/

class 053 {
  public int maxSubArray(int[] nums) {
      int result = Integer.MIN_VALUE;
      int possibleMax = 0;
      
      for(int num: nums) {
          if((possibleMax + num) < num) possibleMax = num; 
          else possibleMax += num;
          if(possibleMax > result) result = possibleMax;
      }
      
      return result;
  }
}