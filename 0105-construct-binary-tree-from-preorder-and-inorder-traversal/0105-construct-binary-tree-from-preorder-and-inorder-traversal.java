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
    public TreeNode func(int[] preorder,int prestart,int preend,int[] inorder,int instart,int inend,HashMap<Integer,Integer> hm){
        if(prestart>preend || instart>inend){
            return null;
        }

        TreeNode root=new TreeNode(preorder[prestart]);
        int inroot=hm.get(root.val);
        int leftnums=inroot-instart;

         root.left=func(preorder,prestart+1,prestart+leftnums,inorder,instart,inroot-1,hm);
         root.right=func(preorder,prestart+leftnums+1,preend,inorder,inroot+1,inend,hm);
      
      return root;
  
    }



    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++){

            hm.put(inorder[i],i);
        }

        TreeNode root=func(preorder,0,preorder.length-1,inorder,0,inorder.length-1,hm);
        return root;
    }
}