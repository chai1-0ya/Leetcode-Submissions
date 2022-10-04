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
    
    List<Integer> ls = new ArrayList<>();
    
    public void xxx(TreeNode root, int x){
        if(root == null)
            return;
        x += root.val;
        if(root.left == null && root.right == null){
            ls.add(x);
            return;
        }
        xxx(root.left, x);
        xxx(root.right, x);
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int x = 0;
        xxx(root, x);
        for(int a : ls){
            // System.out.println(a);
            if(a==targetSum)
                return true;
        }
        return false;
    }
}