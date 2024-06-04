class Solution {
    public int findDuplicate(int[] nums) {
 

 // BRUTE FORCE
    //   Arrays.sort(nums);
    //   for(int i=0;i<nums.length;i++){
    //       if(nums[i]==nums[i+1]){
    //           return nums[i];
    //       }
    //   }

    //   return -1;

    // best use hasing
    //optimal 

    // for(int i=0;i<nums.length;i++){
    //     int index=Math.abs(nums[i]);
    //     if(nums[index]<0){
    //         return index;
    //     }

    //     nums[index]=-nums[index];
    // }


    // return -1;


   // agr bola ke change ni krr skta array phr we use linklist floyeed cycle methord 

   
   int fast=nums[0];
   int slow=nums[0];
 do{
     slow=nums[slow];
     fast=nums[nums[fast]];
 }while(fast!=slow);

 fast=nums[0];
 while(fast!=slow){
     slow=nums[slow];
     fast=nums[fast];
 }

 return fast;


        
    }
}