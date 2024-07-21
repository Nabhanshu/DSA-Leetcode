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

 class pair{
    TreeNode node;
    int idx;

    public pair(TreeNode node,int idx){

        this.node=node;
        this.idx=idx;

    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {

        if(root==null){
            return 0;
        }
        int maxwidth=0;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root,0));

        while(!q.isEmpty()){

    
        int minidx=q.peek().idx;
        int size=q.size();
        int first=0;
        int last=0;

        for(int i=0;i<size;i++){

              
              pair curr=q.remove();
                int changeidx=curr.idx-minidx;
                TreeNode node=curr.node;
                // q.remove();
                if(i==0){
                    first=changeidx;
                }
                if(i==size-1){
                    last=changeidx;
                }

                if(node.left!=null){

                    q.add(new pair(node.left, changeidx*2+1));
                }

                
                if(node.right!=null){

                    q.add(new pair(node.right, changeidx*2+2));
                }
               



            
        }

        maxwidth=Math.max(maxwidth,last-first+1);


        }

        return maxwidth;
        


    }
}