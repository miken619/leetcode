/*class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length, start = -1, end = -2, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; ++i) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);
            
            if(nums[i] < max) end = i;
            if(nums[n - 1 - i] > min) start = n - 1 - i;
        }
        
        return end - start + 1;
    }
}*/

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length, start = -1, end = -2, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; ++i) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);
            
            if(nums[i] < max) end = i;
            if(nums[n - 1 - i] > min) start = n - 1 - i;
        }
        
        return end - start + 1;
    }
}