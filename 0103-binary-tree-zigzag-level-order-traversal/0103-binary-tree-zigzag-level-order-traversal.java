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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        if(root == null)
            return ls;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int flag = 0;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> l = new ArrayList<>(n);
            for(int i=0;i<n;i++){
                TreeNode x = q.poll();
                if(x.left != null)
                    q.add(x.left);
                if(x.right != null)
                    q.add(x.right);
                l.add(x.val);
            }
            if(flag%2 == 0)
                ls.add(l);
            else {
                Collections.reverse(l);
                ls.add(l);
            }
            flag++;
        }
        return ls;
    }
}