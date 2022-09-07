/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void postorder(TreeNode* &root){
        if(!root) return;
        postorder(root->left);
        postorder(root->right);
        if(root->val==0 and !root->left and !root->right) root=nullptr;
    }
    
    TreeNode* pruneTree(TreeNode* root) {
        if(!root) return root;
        postorder(root);
        return root;
    }
};