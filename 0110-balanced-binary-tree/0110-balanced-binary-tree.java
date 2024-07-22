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

    public int getheight(TreeNode root){
        if(root==null){
            return 0;
    }

int lh=getheight(root.left);
if(lh==-1){
    return -1;
}
int rh=getheight(root.right);
if(rh==-1){
    return -1;
}
if(Math.abs(lh-rh)>1){
    return -1;
}
   return Math.max( lh ,rh) +1;

    }
    public boolean isBalanced(TreeNode root) {
        
        // if(root==null){
        //     return true;
        // }

        // if( Math.abs(getheight(root.left)-getheight(root.right))<=1 && isBalanced(root.left) &&  isBalanced(root.right)){
        //     return true;
        // }

        // if(isBalanced(root.left) &&  isBalanced(root.right)){
        //       return true;
        // }

        return getheight(root)!=-1;
       

        // return false;

    
    }
}