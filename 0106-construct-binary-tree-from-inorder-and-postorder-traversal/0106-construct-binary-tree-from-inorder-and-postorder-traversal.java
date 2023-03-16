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
    public TreeNode generate(int in[],int post[],int s, int e)
    {
        if(s>e)
            return(null);
        
        TreeNode root=new TreeNode(post[postIndex--]);
        int inIndex=0;
        for(int i=s;i<=e;i++)
        {
            if(in[i]==root.val)
            {
               inIndex=i;
                break;
            }
        }
              root.right=generate(in,post,inIndex+1,e);
        root.left=generate(in,post,s,inIndex-1);
  
        return(root);
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
     postIndex=postorder.length-1;
       // System.out.println(postIndex);
    return(generate(inorder,postorder,0,postIndex));
       
    }
}
