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
     public static void  postorder(TreeNode root,ArrayList<Integer> List){
               if(root==null){
            return;
        }
        postorder(root.left,List);
        
       postorder(root.right,List);
       List.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> List=new ArrayList<>();
 
           postorder(root,List);

       return List;
        
        
    }
}