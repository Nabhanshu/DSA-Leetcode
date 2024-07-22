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

 public class info{
    int h;
    int d;

    public info(int h,int d){
        this.h=h;
        this.d=d;
    }
 }
class Solution {

    public info func(TreeNode root){
        if(root==null){
            return new info(0,0);
        }


        info left=func(root.left);
        info right=func(root.right);

        int d=Math.max(Math.max(right.d,left.d),left.h + right.h );
        int h=Math.max(left.h,right.h)+1;

        return new info(h,d);
    }
    public int diameterOfBinaryTree(TreeNode root) {
       info ans= func(root);
       return ans.d;
    }
}