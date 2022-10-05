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
    
    List<List<Integer>> ls = new ArrayList<>();
    
    public void xxx(TreeNode root, List<Integer> l){
        if(root == null)
            return;
        l.add(root.val);
        if(root.left == null && root.right == null){
            ls.add(new ArrayList<Integer>(l));
            l.remove(l.size()-1);
            return;
        }
        xxx(root.left, l);
        xxx(root.right, l);
        l.remove(l.size()-1);
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> lls = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        xxx(root, l);
        int t = 0;
        for(List<Integer> a : ls){
            for(int i : a){
                System.out.print(i+" ");
                t += i;
            }
            // System.out.println();
            if(t == targetSum)
                lls.add(a);
            t = 0;
        }
        // for(int i=0;i<ls.size();i++){
        //     for(int j=0;j<ls.get(i).size();j++){
        //         System.out.print(ls.get(i).get(j)+" ");
        //     }
        //     System.out.println();
        // }
        return lls;
    }
}