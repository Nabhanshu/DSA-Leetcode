class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {   
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length&& col>=0){
            if(target==matrix[row][col]){
                return true;
            }

            if(target>matrix[row][col]){
                row+=1;
            }else{
                col-=1;
            }
        }

        return false;
        
    }
}