class Solution {
    public void setZeroes(int[][] matrix) {
        int n =matrix.length;
        int m=matrix[0].length;
        int col1=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;

                    if(j!=0){
                        matrix[0][j]=0;
                    }else{
                        col1=0;
                    }
                }
            }

        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }

            }
        }

        if(matrix[0][0]==0){
            for(int i=0;i<m;i++){
                matrix[0][i]=0;
            }
        }

        if(col1==0){
              for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }

        }
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(arr[i][j]==0){
        //             for(int m=0;m<arr.length;m++){
        //                 if(arr[m][j]!=0){
        //                 arr[m][j]=-1;
        //                 }
        //             }
        //                for(int n=0;n<arr[0].length;n++){
        //                 if(arr[i][n]!=0){
        //                 arr[i][n]=-1;
        //                 }
        //             }


        //         }
        //     }
        // }

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(arr[i][j]==-1){
        //             arr[i][j]=0;
        //         }
        //     }
        // }
        
    }
}