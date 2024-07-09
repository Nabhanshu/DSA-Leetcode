class Solution {

    public void swap(int[] arr,int i,int idx){
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }

    public void func2(int idx,int arr[],List<List<Integer>> ans,int n){

        if(idx==n){
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<n;i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
        }

        for(int i=idx;i<n;i++){
            swap(arr,i,idx);
            func2(idx+1,arr,ans,n);
            swap(arr,idx,i);
        }
    }
    public void func(List<Integer> ds,int arr[],List<List<Integer>> ans,int n,boolean freq[]){
        if(ds.size()==n){
            ans.add(new ArrayList<>(ds));
            return ;
        }

        for(int i=0;i<n;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(arr[i]);
                func(ds,arr,ans,n,freq);   
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
                int n=nums.length;
        //  boolean freq[] = new boolean[n];
  
        // func(new ArrayList<>(),nums,ans,n,freq);
        func2(0,nums,ans,n);
        return ans;
        
        
    }
}