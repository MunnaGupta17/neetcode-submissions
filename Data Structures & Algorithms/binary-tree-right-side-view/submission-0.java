/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (queue.size() != 0) {
            Queue<TreeNode> tempQ = new ArrayDeque<>();
            int level = 0;
            while (!queue.isEmpty()) {
                TreeNode temp = queue.poll();
                if(queue.isEmpty()){
                   level = temp.val;
                }
                
                if (temp.left != null) {
                    tempQ.offer(temp.left);
                }
                if (temp.right != null) {
                    tempQ.offer(temp.right);
                }
            }
            result.add(level);
            queue = tempQ;
        }
        return result;
    }
}
