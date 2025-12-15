class Solution {
    public int maxProfit(int k, int[] prices) {
        int n= prices.length;
        int dp[][][]= new int[n][2][k+1];
         for (int i = 0; i < n; i++) {
            for (int buy = 0; buy < 2; buy++) {
                for (int t = 0; t <= k; t++) {
                    dp[i][buy][t] = -1;
                }
            }
        }
        return solve(prices,0,1,k, dp);
    }
    public int solve(int[] prices,int i,int buy, int k, int[][][] dp){
        if(i==prices.length || k==0){
            return 0;
        }
         if (dp[i][buy][k] != -1) {
            return dp[i][buy][k];
        }

        if(buy==1){
            dp[i][buy][k]= Math.max(-prices[i]+ solve(prices,i+1,0,k,dp),solve(prices,i+1,1,k,dp));
        }
        else{
             dp[i][buy][k]= Math.max(prices[i]+solve(prices,i+1,1,k-1,dp), solve(prices,i+1,0,k,dp));
        }

        return dp[i][buy][k];
    }
}