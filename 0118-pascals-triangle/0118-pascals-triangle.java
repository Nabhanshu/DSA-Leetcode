class Solution {


    //     public static int nCr(int n, int r) {
    //     long res = 1;
    //     // calculating nCr:
    //     for (int i = 0; i < r; i++) {
    //         res = res * (n - i);
    //         res = res / (i + 1);
    //     }
    //     return (int) res;
    // }

        public  void func2(int row, List<List<Integer>> anss,List<Integer> temp){

        // System.out.println();

        int ans=1;
        // System.out.print(ans);
        temp.add(1);
        for(int i=1;i<row;i++){
            ans=ans*(row-i);
            ans=ans/i;

            // System.out.print(ans);
            temp.add(ans);
        }

        anss.add(new ArrayList<>(temp));

        return;

    }

    public List<List<Integer>> generate(int n) {


        // Store the entire Pascal's triangle:
        // for (int row = 1; row <= n; row++) {
          
        //     for (int col = 1; col <= row; col++) {
        //         tempLst.add(nCr(row - 1, col - 1));
        //     }
        //     ans.add(tempLst);
        // }
        // return ans;
        //   List<Integer> temp = new ArrayList<>(); 
          List<List<Integer>> ans = new ArrayList<>();

                for(int i=1;i<=n;i++){
               func2(i,ans,new ArrayList<>());
            
        }

        return ans;
   

        
    }
}