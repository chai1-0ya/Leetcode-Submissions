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
    int maxi = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxi;
    }
    
    // void find(TreeNode head){
    //     if(head==null)
    //         return;
    //     int lh = height(head.left);
    //     int rh = height(head.right);
    //     maxi = Math.max(maxi, lh+rh);
    //     find(head.left);
    //     find(head.right);
    // }
    
    int height(TreeNode head){
        if(head==null)
            return 0;
        int lh = height(head.left);
        int rh = height(head.right);
        maxi = Math.max(maxi, lh+rh);
        return 1+Math.max(lh,rh);
    }
}