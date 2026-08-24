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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while(queue.size() != 0){
            Queue<TreeNode> tempQ = new ArrayDeque<>();
            List<Integer> level = new ArrayList<>();
            while(!queue.isEmpty()){
                TreeNode temp = queue.poll();
                level.add(temp.val);
                if(temp.left != null){
                   tempQ.offer(temp.left);
                }
                 if(temp.right != null){
                    tempQ.offer(temp.right);
                 }
                 
            }
            result.add(level);
            queue = tempQ;
        }

        return result;
    }
}
