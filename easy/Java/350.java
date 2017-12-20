/*Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?*/


class 350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int num: nums2) map.put(num, map.getOrDefault(num, 0) + 1);
        for(int num: nums1) {
            int value = map.getOrDefault(num, 0);
            if(value > 0) {
                list.add(num);
                map.put(num, value - 1);
            }
        }
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); ++i) {
            result[i] = list.get(i);
        }
        
        return result;
        
        
    }
}