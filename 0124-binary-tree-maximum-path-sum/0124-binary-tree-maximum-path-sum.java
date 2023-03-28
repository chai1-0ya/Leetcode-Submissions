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
    
    int maxi;
    
    public int maxPathSum(TreeNode root) {
        maxi = Integer.MIN_VALUE;
        sum(root);
        return maxi;
    }
    
    int sum(TreeNode root){
        if(root==null)
            return 0;
        
        int lh = Math.max(0,sum(root.left));
        int rh = Math.max(0,sum(root.right));
        
        maxi = Math.max(maxi, root.val+lh+rh);
        
        return root.val + Math.max(lh, rh);
    }
}