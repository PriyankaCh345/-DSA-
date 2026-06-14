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

    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    public int checkHeight(TreeNode root) {

        // base case
        if (root == null) return 0;

        // left height
        int left = checkHeight(root.left);
        if (left == -1) return -1;

        // right height
        int right = checkHeight(root.right);
        if (right == -1) return -1;

        // balance check
        if (Math.abs(left - right) > 1) {
            return -1;
        }

        // return height
        return Math.max(left, right) + 1;
    }
}