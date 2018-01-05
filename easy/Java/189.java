/*For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

[show hint]

Hint:
Could you do it in-place with O(1) extra space?
Related problem: Reverse Words in a String II*/

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        rotateHelper(nums, 0, nums.length - 1);
        rotateHelper(nums, 0, k - 1);
        rotateHelper(nums, k, nums.length - 1);
    }
    
     public void rotateHelper(int[] nums, int i, int j) {
        while(i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            ++i;
            --j;
        }
    }
}