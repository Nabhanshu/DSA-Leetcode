class Solution {
    public int[][] merge(int[][] arr) {

        // int ans[][]=new int[arr.length][arr[0].length];

        // Arrays.sort(arr,new Comparator<int []> (){
        //     public int compare(int a[],int b[]){
        //         return a[0]-b[0];
        //     }
        // });

        // for(int i=0;i<arr.length;i++){
        //         if(ans.length==0 || ans[ans.length-1][1]<arr[i][0]){

        //             ans[i][0]=arr[i][0];
        //             ans[i][1]=arr[i][1];

        //         }else{
                    
        //             ans[ans.length-1][1]=Math.max(ans[ans.length-1][1],arr[i][1]);
        //         }

        // }

        // return ans;

//         int n = arr.length; // size of the array
//         //sort the given intervals:
//         Arrays.sort(arr, new Comparator<int[]>() {
//             public int compare(int[] a, int[] b) {
//                 return a[0] - b[0];
//             }
//         });
// List<List<Integer>> ans = new ArrayList<>();

//         for (int i = 0; i < n; i++) {
          
//             if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
//              ans.add(Arrays.asList(arr[i][0], arr[i][1]));
//             }
          
//             else {
//                 ans.get(ans.size() - 1).set(1,
//                                             Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
//             }
//         }
//       return  ans.toArray(new int[ans.size()][]);

    if (arr.length <= 1) {
            return arr;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<int[]> ans = new ArrayList<>();
        int[] currentInterval = arr[0];
        ans.add(currentInterval);

        for (int[] interval : arr) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                ans.add(currentInterval);
            }
        }

        return ans.toArray(new int[ans.size()][]);

    
        
    }
}