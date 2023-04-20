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
    
    int t;
    
    public int longestZigZag(TreeNode root) {
        t = 0;
        dfs(root, true, 0);
        dfs(root, false, 0);
        return t;
    }
    
    public void dfs(TreeNode tree, boolean goright, int steps){
        if(tree==null)
            return;
        t = Math.max(t, steps);
        if(goright){
            dfs(tree.right, false, steps+1);
            dfs(tree.left, true, 1);
        }
        if(!goright){
            dfs(tree.left, true, steps+1);
            dfs(tree.right, false, 1);
        }
    }
}