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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean f = false;
        if((p==null && q==null))
            return true;
        if(p==null || q==null)
            return false;
        if((p.val==q.val))
            f = true;
        boolean l = isSameTree(p.left, q.left);
        boolean r = isSameTree(p.right, q.right);
        return f&l&r;
    }
}