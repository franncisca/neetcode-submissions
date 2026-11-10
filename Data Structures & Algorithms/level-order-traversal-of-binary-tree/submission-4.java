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
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        //Review 2
        //S O(log 2)
        //T O (log 2)
        

        dfsCollection(root, 0);

        return res;
        
    }

    private void dfsCollection(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        if (level == res.size()) {
            res.add(new ArrayList<>());
        }

        res.get(level).add(node.val);
        //System.out.println("level:" + level + " val:" + node.val);

        dfsCollection(node.left, level + 1);
        dfsCollection(node.right, level + 1);
    }
}
