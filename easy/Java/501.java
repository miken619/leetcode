/*Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.
For example:
Given BST [1,null,2,2],
   1
    \
     2
    /
   2
return [2].

Note: If a tree has more than one mode, you can return them in any order.

Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class 501 {
    public int[] findMode(TreeNode root) {
        if(root == null) return new int[0];
        
        int mode = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int value = map.getOrDefault(node.val, 0) + 1;
            mode = Math.max(mode, value);
            map.put(node.val, value);
            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right);
        }
        
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) if(entry.getValue() == mode) list.add(entry.getKey());
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); ++i) result[i] = list.get(i);
        
        return result;
        
    }
}