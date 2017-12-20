/*Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.


Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5*/

 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }
    
    public TreeNode sortedArrayToBSTHelper(int[] nums, int low, int high) {
        if(low > high) return null;
        
        int mid = low + (high - low)/2;
        
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = sortedArrayToBSTHelper(nums, low, mid - 1);
        node.right = sortedArrayToBSTHelper(nums, mid + 1, high);
        
        return node;
    }  
}