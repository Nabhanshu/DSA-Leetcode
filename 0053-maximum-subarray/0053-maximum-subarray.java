class Solution {
    public int maxSubArray(int[] nums) {
        // int ms=Integer.MIN_VALUE;
        // int cs=0;
        // for(int i=0;i<nums.length;i++){
        //     cs+=nums[i];

        //     ms= Math.max(cs,ms);
        //     if(cs<0){
        //         cs=0;
        //     }

           
        // }

        // return ms;

        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
             
             currsum+=nums[i];
          

             maxsum=Math.max(currsum,maxsum);
                if(currsum<0){
                 currsum=0;
             }

        }

        return maxsum;
     
        
    }
}