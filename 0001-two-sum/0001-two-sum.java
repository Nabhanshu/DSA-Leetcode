class Solution {
    public int[] twoSum(int[] arr, int target) {
        // int ans[]=new int[2];
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]+arr[j]==target){
        //          ans[0]=i;
        //          ans[1]=j;
        //         }
        //     }
        // }

        // return ans;

        // Hashing

        // int ans[]=new int[2];
        // HashMap<Integer,Integer> hm= new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     int req=target-arr[i];
        //     if(hm.containsKey(req)){
        //         ans[0]=hm.get(req);
        //         ans[1]=i;
        //         break;
        //     }else{
        //         hm.put(arr[i],i);
        //     }
        // }

        // return ans;

        // 2 pointer

        // Arrays.sort(arr);
   
        // int ans[]=new int[2];
        // int n=arr.length;
        // int left=0;
        // int right=n-1;
        // while(left<right){
        //     int sum=arr[left]+arr[right];
        // if(sum==target){
        //     ans[0]=left;
        //     ans[1]=right;
        //      break;
        // }else if(sum<target){
        //     left++;
        // }else{
        //     right--;
        // }
        // }

        // return ans;

        HashMap<Integer,Integer> hm =new HashMap<>();
        int ans[]=new int[2];
        int n=arr.length;
        for(int i=0;i<n;i++){
            int req=target-arr[i];
            if(hm.containsKey(req)){
                ans[0]=hm.get(req);
                ans[1]=i;
                break;
            }else{
                hm.put(arr[i],i);
            }

        }
        return ans;


        
    }
}