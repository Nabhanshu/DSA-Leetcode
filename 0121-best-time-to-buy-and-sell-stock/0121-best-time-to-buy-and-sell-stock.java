class Solution {
    public int maxProfit(int[] prices) {
// int bp=Integer.MAX_VALUE;
// int mp=0;

// for(int i=0;i<prices.length;i++){
//     if(bp>prices[i]){
//         bp=prices[i];

//     }

//     else{
//         int p=prices[i]-bp;
//         mp=Math.max(mp,p);

//      }
// }
// return mp;

int buyprice=Integer.MAX_VALUE;
int maxprofit=0;
for(int i=0;i<prices.length;i++){
    if(buyprice<prices[i]){
        int profit=prices[i]-buyprice;
        maxprofit=Math.max(profit,maxprofit);
    }
    else{
        buyprice=prices[i];
    }
}

return maxprofit;

}
}