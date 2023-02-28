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
    
    String walk( List<TreeNode> list,HashMap<String,Integer> h,TreeNode root)
    {
        if(root==null)
            return "";
        String left=walk(list,h,root.left);
        String right=walk(list,h,root.right);
        String newString=root.val+" "+left+" "+right;
        if(h.getOrDefault(newString,0)==1)
        {
            list.add(root);
        }
        h.put(newString,h.getOrDefault(newString,0)+1);
        return newString;
    }
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        
        List<TreeNode> list=new ArrayList<>();
        HashMap<String,Integer> h=new HashMap<>();
        walk(list,h,root);
        return list;
        
        
    }
}