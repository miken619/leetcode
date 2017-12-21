/*Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


class 257 {
  public List<String> binaryTreePaths(TreeNode root) { 
      List<String> list = new ArrayList<>();
      if(root == null) return list;
      binaryTreePathsHelper(root, "", list);
      return list;
  }
  
  public void binaryTreePathsHelper(TreeNode root, String str, List<String> list) {
      if(root.left == null && root.right == null) list.add(str + root.val);
      if(root.left != null) binaryTreePathsHelper(root.left, str + root.val + "->", list);
      if(root.right != null) binaryTreePathsHelper(root.right, str + root.val + "->", list);
      
      
  }
}