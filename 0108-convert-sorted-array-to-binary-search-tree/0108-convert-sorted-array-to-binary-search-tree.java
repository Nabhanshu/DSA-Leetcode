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

    public TreeNode func(int arr[],int s,int e){
        if(s>e){
            return null;
        }

        int mid=(s+e)/2;
        TreeNode root=new TreeNode(arr[mid]);

        root.left=func(arr,s,mid-1);
        root.right=func(arr,mid+1,e);

        return root;
    }
    public TreeNode sortedArrayToBST(int[] arr) {

        TreeNode root =func(arr,0,arr.length-1);
        return root;
        
    }
}