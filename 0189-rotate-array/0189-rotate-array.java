class Solution {

    public void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;

        }
    }

    public void rotate(int[] nums, int k) {

        int n=nums.length;
      
  
        // for(int i=1;i<=k;i++){

        //     int number=nums[n-1];
        //           System.out.print(number);

        //     for(int j=1;j<=n-1;j++){
        //         nums[n-j]=nums[n-j-1];
        //     }

        //     nums[0]=number;

            
        // }

        k=k%n;

   reverse(nums,0,n-1);
     reverse(nums,0,k-1);
   reverse(nums,k,n-1);
 
   
      

      
        
    }
}