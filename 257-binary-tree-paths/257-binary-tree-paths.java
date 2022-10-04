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
    
    List<String> s = new ArrayList<>();
    
    public void xxx(TreeNode root, String ss){
        if(root == null){
            return;
        }
        ss += Integer.toString(root.val);
        if(root.left == null && root.right == null){
            // ss += Integer.toString(root.val);
            s.add(ss);
        }
        ss += "->";
        xxx(root.left,ss);
        xxx(root.right,ss);
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        String ss = "";
        xxx(root, ss);
        return s;
    }
}