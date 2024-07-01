class Solution {
    public double myPow(double x, int n) {
        // double ans=1;
        // int pow;
        // if(n<0){
        //     pow=-n;
        // }else{
        //     pow=n;
        // }

        // if(n==0){
        //     return 1;
        // }
        // for(int i=1;i<=pow;i++){
        //     ans=ans*x;
        // }
        // if(n<0){
        //     return 1/ans;
        // }
        // return ans;
        double ans=1;
        long pow=n;
        if(n<0){
            pow=-pow;
        }
        while(pow>0){
            if(pow%2==0){
                x=x*x;
                pow=pow/2;
            }else{
                ans=ans*x;
                pow=pow-1;
            }
        }

        if(n<0){
            return 1/ans;
        }
        return ans;
        
    }
}