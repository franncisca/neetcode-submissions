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
    //review2
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        bfs(root, 0);
        return res;
    }

    private void bfs(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(node.val);

        bfs(node.left, level + 1);
        bfs(node.right, level + 1);
    }

}
