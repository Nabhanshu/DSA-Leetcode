class Solution {
    public int majorityElement(int[] nums) {
       
    //    Brute force--->
        // int n=nums.length;
        // for(int i=0;i<n;i++){

        //   int count=0;
        //   for(int j=0;j<n;j++){
        //       if(nums[i]==nums[j]){
        //           count++;
        //       }
        //   }

        //   if(count>n/2){
        //       return nums[i];
        //   }

        // }

        // return 0;

      //  Better Approach---> using hashing                                                        whenever a ques occur relative to count always use hashing

        
    //   int n=nums.length;
    //   HashMap<Integer,Integer> hm=new HashMap<>();
    //   for(int i=0;i<n;i++){
    //      int value= hm.getOrDefault(nums[i],0);
    //      hm.put(nums[i],value+1);

    //   }

    //   for(Map.Entry<Integer,Integer> x : hm.entrySet()){
    //       if(x.getValue()>(n/2)){
    //           return x.getKey();
    //       }
    //   }

    //   return -1;




























      

    // Optimal approach  Moors voting therom

    int count=0;
    int element=0;
    for(int i=0;i<nums.length;i++){
        if(count==0){
            element=nums[i];
            count=1;
        }

       else if(element==nums[i]){
            count++;
        }else{
            count--;
        }

    }


    // verify
    int countverify=0;
    for(int i=0;i<nums.length;i++){
         
         if(element==nums[i]){
             countverify++;
         }

         if(countverify>(nums.length/2)){
             return element;
         }
    }

    return -1;

    }
}