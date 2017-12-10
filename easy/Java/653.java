/*Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

Example 1:
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9

Output: True
Example 2:
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28

Output: False
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
class 653 {
  //     public boolean findTarget(TreeNode root, int k) {
  //         if(root == null) return false;
          
  //         HashSet<Integer> set = new HashSet<>();
  //         LinkedList<TreeNode> queue = new LinkedList<>();
          
  //         queue.offer(root);
  //         while(!queue.isEmpty()) {
  //             TreeNode node = queue.poll();
              
  //             if(set.contains(k - node.val)) return true;
  //             else set.add(node.val);
              
  //             if(node.left != null) queue.offer(node.left);
  //             if(node.right != null) queue.offer(node.right);
  //         }
          
  //         return false;
  //     }
      
      public boolean findTarget(TreeNode root, int k) {
          if(root == null) return false;
          
          HashSet<Integer> set = new HashSet<>();
          
          return findTargetHelper(root, k, set);
      }
      
      public boolean findTargetHelper(TreeNode root, int k, HashSet<Integer> set) {
          if(root == null) return false;
          
          if(set.contains(k - root.val)) return true;
          set.add(root.val);
          
          return findTargetHelper(root.left, k, set) || findTargetHelper(root.right, k, set);
          
      }
  }