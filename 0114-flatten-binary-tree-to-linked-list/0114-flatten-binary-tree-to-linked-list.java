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
    // public void func(TreeNode root,TreeNode prev){
      
     
    // }
        // TreeNode prev=null;
    public  void flatten(TreeNode root) {

        TreeNode curr=root;

        while(curr!=null){
            if(curr.left!=null){
                TreeNode prev=curr.left;
                while(prev.right!=null){
                    prev=prev.right;
                }

                prev.right=curr.right;
                curr.right=curr.left;
                curr.left=null;
            }

            curr=curr.right;

        }
     
        
        //   if(root==null){
        //     return ;
        // }
           
        // flatten(root.right);
        // flatten(root.left);

        // root.right=prev;
        // root.left=null;
        // prev=root;
    
     
      
//  func(root,prev);



        
    }
}