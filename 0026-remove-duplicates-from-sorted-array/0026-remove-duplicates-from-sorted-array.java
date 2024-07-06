class Solution {

  

public int func(int i,int j,int arr[] ){


    if(arr.length==0){
        return 0;
    }

    if(j==arr.length){
        return i+1;
    }


    if(arr[i]!=arr[j]){
        i=i+1;
        arr[i]=arr[j];
        
    }

    return  func(i,j+1,arr);
  

   
    
}
  
    public int removeDuplicates(int[] arr) {
        int ans=func(0,1,arr);
        // int i=0;
        // for(int j=1;j<arr.length;j++){
        //     if(arr[i]!=arr[j]){
        //         i++;
        //         arr[i]=arr[j];
        //     }
        // }

        return ans;
    }
}