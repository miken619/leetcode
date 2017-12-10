/*Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

Example:

Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13*/



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 538 {
  public TreeNode convertBST(TreeNode root) {
    convertBSTHelper(root, 0);
     
     return root;
     
 }
 
 public int convertBSTHelper(TreeNode root, int sum) {
     if(root == null) return sum;
     int right = convertBSTHelper(root.right, sum);
     root.val += right;
     int left = convertBSTHelper(root.left, root.val);
     
     
     return left;
     
     
 }
}