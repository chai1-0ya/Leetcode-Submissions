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
        if(check(root)==-1)
            return false;
        return true;
    }
    
    public int check(TreeNode root){
        if(root==null)
            return 0;
        
        int lt = check(root.left);
        int rt = check(root.right);
        
        if(lt==-1 || rt==-1 || Math.abs(lt-rt)>1)
            return -1;
        
        return Math.max(lt,rt)+1;
    }
}