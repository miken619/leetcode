/*Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.*/

class 169 {
    public int majorityElement(int[] nums) {
//         int majority = nums.length/2;
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for(int num: nums) {
//             if(map.containsKey(num)) map.put(num, map.get(num) + 1);
//             else map.put(num, 1);
                
//             if(map.get(num) > majority) return num;
//         }
        
       
//         return 0;
        
        int majority = nums[0], int count = 1;
        
        for(int i = 1; i < nums.length; ++i) {
            if(major == nums[i]) ++count;
            else if (count == 0) {
                ++count;
                majority = nums[i]
            }else --count;
        }
        
        return majority;
        
    }
}