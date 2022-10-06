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
    
    List<String> ls = new ArrayList<>();
    
    public void path(TreeNode root, String s){
        if(root == null)
            return ;
        s += root.val;
        if(root.left == null && root.right == null){
            // s += root.val;
            ls.add(s);
            
        }
        path(root.left, s);
        path(root.right, s);
    }
    
    public int sumNumbers(TreeNode root) {
        String s = "";
        int sum = 0;
        path(root, s);
        for(int i=0;i<ls.size();i++){
            String ss = ls.get(i);
            sum += Integer.parseInt(ss);
        }
        return sum;
    }
}