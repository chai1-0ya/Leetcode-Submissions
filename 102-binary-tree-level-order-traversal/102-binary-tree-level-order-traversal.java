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
        List<List<Integer>> ls = new ArrayList<>();
        // List<Integer> l = new ArrayList<>();
        if(root == null)
            return ls;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            int n = q.size();
            List<Integer> l = new ArrayList<>();
            while(n-->0){
                TreeNode x = q.poll();
                l.add(x.val);
                System.out.println(x.val);
                if(x.left!=null)
                    q.add(x.left);
                if(x.right!=null)
                    q.add(x.right);
            }
            ls.add(l);
            // l.clear();
        }
        return ls;
    }
}