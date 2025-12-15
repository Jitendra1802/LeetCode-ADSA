class Solution {
    public int maxProfit(int[] prices, int fee) {
         int n=prices.length;
         int[][] dp =new int[n][2];
         for(int i=0;i<n;i++){
            for(int buy=0;buy<2;buy++){
                dp[i][buy]=-1;
            }
         }
        return solve(prices,0,1,fee, dp);

    }
    public int solve(int[] prices, int i, int buy, int fee, int[][] dp){
        if(i==prices.length){
            return 0;
        }
        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }
        if(buy==1){   // stocks khareed skte h 
            dp[i][buy]= Math.max(-prices[i]+solve(prices,i+1,0,fee,dp),      // stock khreeda paise kharch hue , ab next day bech skte h 
            solve(prices,i+1,1,fee,dp));                                  // skip kuchh bhi nhi khareeda
        }else{
            dp[i][buy]= Math.max(prices[i]-fee+solve(prices,i+1,1,fee,dp), // stock bech diya aur buy 1 kar diya next day khreed skte h
            solve(prices,i+1,0,fee,dp));                          // skip kar diya
        }
        return dp[i][buy];
    }
}