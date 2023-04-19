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
    
    int postIndex=0;
    Map<Integer,Integer> mp;
    public TreeNode generate(int post[],int s, int e)
    {
        if(s>e)
            return null;
        int t = post[postIndex--];
        TreeNode root=new TreeNode(t);
        root.right=generate(post,mp.get(t)+1,e);
        root.left=generate(post,s,mp.get(t)-1);
  
        return root;
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        mp = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            mp.put(inorder[i],i);
        postIndex=postorder.length-1;
        return generate(postorder,0,postIndex);
       
    }
}
