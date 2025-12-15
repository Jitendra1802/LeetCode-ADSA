class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int[][][] dp=new int[n+1][2][2];

        for (int i = 0; i < n; i++) {
            for (int buy = 0; buy < 2; buy++) {
                for(int t=0;t<2;t++){
                    dp[i][buy][t] = -1;
                }
            }
        }
        return solve(prices,0,1,1, dp);
    }
    private int solve(int[] prices,int i , int buy, int t, int[][][] dp){
        //Base case
        if(i>=prices.length || t<=0){
            return 0;
        }
        if(dp[i][buy][t]!=-1){
            return dp[i][buy][t];
        }
        if(buy==1){
            dp[i][buy][t]= Math.max(-prices[i]+solve(prices,i+1,0,1,dp), solve(prices,i+1,1,1,dp));
        }
        else{
            dp[i][buy][t]= Math.max(prices[i]+solve(prices,i+1,1,0,dp), solve(prices,i+1,0,1,dp));
        }
        return dp[i][buy][t];
    }
}