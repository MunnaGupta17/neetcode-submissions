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
    static int bfs(TreeNode root, int count) {
        if (root == null)
            return count;
        count++;
        return Math.max(bfs(root.left, count), bfs(root.right, count));
    }

    public int maxDepth(TreeNode root) {
        int result = bfs(root, 0);
        return result;
    }
}
