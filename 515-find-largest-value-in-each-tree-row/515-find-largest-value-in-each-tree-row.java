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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        if(root==null)
            return ls;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            int n = q.size();
            int max = Integer.MIN_VALUE;
            while(n-->0){
                TreeNode x = q.poll();
                max = Math.max(max,x.val);
                if(x.left!=null)
                    q.add(x.left);
                if(x.right!=null)
                    q.add(x.right);
            }
            ls.add(max);
        }
        return ls;
    }
}