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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> s = new HashSet<>();
        return xxx(root,k,s);
    }
    public boolean xxx(TreeNode root, int k, Set<Integer> s){
        
        if(root == null) 
            return false;
        if(s.contains(k-root.val)) 
            return true;
        
        s.add(root.val);
        
        if(xxx(root.left,k,s) || xxx(root.right,k,s)){
            return true;
        }
        return false;
    }
}