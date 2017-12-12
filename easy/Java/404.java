/*Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 404 {
    
//     public int sumOfLeftLeaves(TreeNode root) {
//         return sumOfLeftLeavesHelper(root, false);
//     }
    
//      public int sumOfLeftLeavesHelper(TreeNode root, boolean isLeft) {
//         if(root == null) return 0;   
//         if(root.left == null && root.right == null) return isLeft ? root.val : 0;
         
//         return sumOfLeftLeavesHelper(root.left, true) + sumOfLeftLeavesHelper(root.right, false);
//     }
    
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        
        LinkedList<TreeNode> queue = new LinkedList<>();
        int result = 0;
        
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            TreeNode tree = queue.poll();
            
             if(tree.left!=null){
                if(tree.left.left == null && tree.left.right == null)
                    result+=tree.left.val;
                else
                    queue.offer(tree.left);
            }
            if(tree.right!=null){
                queue.offer(tree.right);
            }
        }
        
        return result;
    }
}