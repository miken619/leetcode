/*Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
Trivia:
This problem was inspired by this original tweet by Max Howell:
Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so fuck off.*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 226 {
  //     public TreeNode invertTree(TreeNode root) {
  //         if(root == null) return null;
          
  //         TreeNode left = invertTree(root.left);
  //         TreeNode right = invertTree(root.right);
          
  //         root.left = right;
  //         root.right = left;
      
  //         return root;
  //     }
      
      public TreeNode invertTree(TreeNode root) {
          if(root == null) return null;
          
          LinkedList<TreeNode> queue = new LinkedList<>(); 
          
          queue.offer(root);
          while(!queue.isEmpty()) {
              TreeNode node = queue.poll();
              TreeNode left = node.left;
              node.left = node.right;
              node.right = left;
              if(node.left != null ) queue.offer(node.left);
              if(node.right != null ) queue.offer(node.right);
          }
          
          return root;
      }
  }