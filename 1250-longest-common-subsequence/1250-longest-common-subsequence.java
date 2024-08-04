class Solution {
       public  int lcs(String x,String y,int n,int m){
        int dp[][] = new int [n+1][m+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i] = 0;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        return lcs(text1,text2,text1.length(),text2.length());
        
    }
}