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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll= new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root==null)
            return ll;
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> l = new LinkedList<>();
            for(int i=0;i<n;i++){
                TreeNode t = q.poll();
                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
                l.add(t.val);
            }
            ll.add(l);
        }
        return ll;
    }
}