class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Extrmee Brute force
        //  ArrayList<Integer> arr=new ArrayList<>();
        //  int n=nums.length;
        // for(int i=0;i<nums.length;i++){
 
        //     if(arr.size()==0 || arr.get(0)!=nums[i]){

        //         int count=0;
        //         for(int j=0;j<nums.length;j++){

        //              if(nums[i]==nums[j]){
        //                  count++;
        //              }


        //              }
                     
        //              if(count > n/3){
        //                  arr.add(nums[i]);
        //         }

                
        //     }

        //     if(arr.size()>=2){
        //         break;
        //     }
        // }
        //  return arr;


        // Better apporoach hashing

        
    //   int n=nums.length;
    //   double minreq= Math.floor(n/3)+1;
    //   ArrayList<Integer> arr=new ArrayList<>();
    //   HashMap<Integer,Integer> hm=new HashMap<>();
    //   for(int i=0;i<n;i++){
    //      int value= hm.getOrDefault(nums[i],0);
    //      hm.put(nums[i],value+1);


        
    //      if(hm.get(nums[i])>=minreq){
    //          arr.add(nums[i]);
             
    //      }

     

        //  System.out.print(minreq);

    //      if(arr.size()>=2){
    //        break;
    //      }

    //   }

    //   return arr;

    //Optimal approach

   int count1=0;
   int element1=0;
   int count2=0;
   int element2=0;
   int n=nums.length;
   int minreq=(int)(n/3)+1;
   ArrayList<Integer> list=new ArrayList<>();
   for(int i=0;i<nums.length;i++){
       if(count1==0 && nums[i]!=element2){
           count1=1;
           element1=nums[i];
       }else if(count2==0 && nums[i]!=element1){
           count2=1;
           element2=nums[i];
       }else if(nums[i]==element1){
           count1++;

       }else if(nums[i]==element2){
           count2++;
       }else{
           count1--;
           count2--;
       }
   }

       //verify
       int countv1=0;
       int countv2=0;
       for(int j=0;j<nums.length;j++){

           if(element1==nums[j]){
               countv1++;
           }else if(element2==nums[j]){
               countv2++;
           }

      
       }

            if(countv1>=minreq){
               list.add(element1);
           }

           if(countv2>=minreq){
               list.add(element2);
           }
   


    return list;
    }
}