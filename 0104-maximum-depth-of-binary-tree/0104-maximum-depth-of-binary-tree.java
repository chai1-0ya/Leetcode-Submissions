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
    public int maxDepth(TreeNode root) {
        // List<List<Integer>> ll= new LinkedList<>();
        int size = 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root==null)
            return 0;
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            // List<Integer> l = new LinkedList<>();
            for(int i=0;i<n;i++){
                TreeNode curr = q.poll();
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
                // l.add(curr.val);
            }
            size++;
            // ll.add(l);
        }
        return size;
    }
}