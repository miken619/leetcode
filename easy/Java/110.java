/*Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        int result = isBalancedHelper(root);
       
        return result != -1;
    }
    
     public int isBalancedHelper(TreeNode root) {
        if(root == null) return 0;

        int left = isBalancedHelper(root.left);
        int right = isBalancedHelper(root.right);
        int diff = Math.abs(left - right);
         
        if(left == -1 || right == -1 || diff > 1) return -1;
        return Math.max(left, right) + 1;
    }
}