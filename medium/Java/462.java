/*Given a non-empty integer array, find the minimum number of moves required to make all array elements equal, where a move is incrementing a selected element by 1 or decrementing a selected element by 1.

You may assume the array's length is at most 10,000.

Example:

Input:
[1,2,3]

Output:
2

Explanation:
Only two moves are needed (remember each move increments or decrements one element):

[1,2,3]  =>  [2,2,3]  =>  [2,2,2]*/

class Solution {
    public int minMoves2(int[] nums) {

        
//             int median = quickselect(nums, nums.length/2+1, 0, nums.length - 1);
//             int sum = 0;
//             for(int num: nums) sum += Math.abs(median - num);

//             return sum;
        
        Arrays.sort(nums);
//         int i = 0, j = nums.length - 1;
//         int count = 0;
        
//         while(i < j) {
//             count += nums[j] - nums[i];
//             ++i;
//             --j;
//         }
        
//         return count;
        int median = nums[nums.length/2];
        int count = 0;
        for(int num: nums) {
            count += Math.abs(num - median);
        }
        
        return count;
        
        
    }
    
    public int quickselect(int[] A, int k, int start, int end) {
        int l = start, r = end, pivot = A[(l+r)/2];
        while (l<=r) {
            while (A[l] < pivot) l++;
            while (A[r] > pivot) r--;
            if (l>=r) break;
            swap(A, l++, r--);
        }
        int len = l - start + 1;
        if (len > k) return quickselect(A, k, start, l-1);
        if (len == k && l == r) return A[l];
        return quickselect(A, k-r+start-1, r+1, end);
    }

    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    } 
}