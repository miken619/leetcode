/*Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.

Note: The length of path between two nodes is represented by the number of edges between them.

Example 1:

Input:

              5
             / \
            4   5
           / \   \
          1   1   5
Output:

2
Example 2:

Input:

              1
             / \
            4   5
           / \   \
          4   4   5
Output:

2
Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than 1000.

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 687 {
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
        
        int leftHelper = longestUnivaluePathhelper(root.left, root.val);
        int rightHelper = longestUnivaluePathhelper(root.right, root.val);
        int left =   longestUnivaluePath(root.left);
        int right =  longestUnivaluePath(root.right);
     
        return Math.max(leftHelper + rightHelper, Math.max(left, right));
    }
    
    public int longestUnivaluePathhelper(TreeNode root, int value) {
        if(root == null || root.val != value) return 0;
        
        int left = longestUnivaluePathhelper(root.left, value);
        int right = longestUnivaluePathhelper(root.right, value);
        
        return Math.max(left, right) + 1;
        
    }
}