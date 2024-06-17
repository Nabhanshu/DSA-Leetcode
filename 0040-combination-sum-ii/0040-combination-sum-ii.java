class Solution {

       public void func(int idx,int n,int[] candidates,int target,List<List<Integer>> ans ,ArrayList<Integer> ds){
                 
                 if(target == 0){
            ans.add(new ArrayList<Integer>(ds));
                return;
            }

        for(int i=idx;i<n;i++){
            if(i!=idx && candidates[i]==candidates[i-1]){
                continue;

            }
         
            
            if(candidates[i]>target){
                break;
            }
                ds.add(candidates[i]);
             func(i+1,n,candidates,target-candidates[i],ans,ds);
           ds.remove(ds.size()-1);
        }
 

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
              int n=candidates.length;
        List<List<Integer>> ans =new ArrayList<>();
        Arrays.sort(candidates);
        func(0,n,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}