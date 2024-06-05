class Solution {
    public void nextPermutation(int[] nums) {

        int n =nums.length;
        int index=-1;
        for(int i= n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }

        if(index==-1){
      
            int first=0;
            int last=n-1;
            while(first<last){
                int temp=nums[last];
                nums[last]=nums[first];
                nums[first]=temp;
                first++;
                last--;
            }

            System.out.print(nums);

        }else{

        for(int i=n-1;i>index;i--){

          
            if(nums[i]>nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
              
                break;
                
            }
        }
       
       int first=index+1;
       int last=n-1;
 

     while(first<last){
                int temp=nums[last];
                nums[last]=nums[first];
                nums[first]=temp;
                first++;
                last--;
            }


        System.out.print(nums);

    

        }



        
    }
}