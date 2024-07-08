class Solution {
 
 public void func( int idx, List<List<Integer>> ans, int[] nums, List<Integer> ds){
     ans.add(new ArrayList<>(ds));
     for(int i=idx;i<nums.length;i++){

         if(i!=idx && nums[i]==nums[i-1]){
             continue;
         }
         ds.add(nums[i]);

         func(i+1,ans,nums,ds);
         ds.remove(ds.size()-1);
     }
 }

 public void func2(int idx,List<List<Integer>> ans,int[] arr,List<Integer> ds){
     if(idx==arr.length){
         ans.add(new ArrayList<>(ds));
         return;
     }

     ds.add(arr[idx]);
     func2(idx+1,ans,arr,ds);
     ds.remove(ds.size()-1);

     func2(idx+1,ans,arr,ds);
 } 


    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        func(0,ans,nums,new ArrayList<>());
        //  func2(0,ans,nums,new ArrayList<>());
        return ans;
        
    }
}