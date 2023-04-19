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
    
    int idx;
    Map<Integer,Integer> mp;
    
    public TreeNode buildTree(int[] pre, int[] in) {
        idx = 0;
        mp = new HashMap<>();
        for(int i=0;i<in.length;i++){
            mp.put(in[i],i);
        }
        // tree = new TreeNode();
        return sol(pre,0,pre.length-1);
    }
    
    public TreeNode sol(int[] pre, int i, int j){
        if(i>j){
            return null;
        }
        int t = pre[idx++];
        TreeNode tree = new TreeNode(t);
        tree.left = sol(pre, i, mp.get(t)-1);
        tree.right = sol(pre, mp.get(t)+1, j);
        return tree;
    }
}