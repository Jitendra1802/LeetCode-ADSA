class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int[][] dp= new int[n+1][2];
        for(int i=0;i<n;i++){
            for(int buy=0;buy<2;buy++){
                dp[i][buy]=-1;
            }
        }
        return solve(prices,0,1,dp);
    }
    private int solve(int[] prices,int i , int buy,int[][] dp){
        //Base case
        if(i>=prices.length){
            return 0;
        }
        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }
        if(buy==1){
            dp[i][buy]= Math.max(-prices[i]+solve(prices,i+1,0,dp), solve(prices,i+1,1,dp));
        }
        else{
            dp[i][buy]= Math.max(prices[i]+solve(prices,i+1,1,dp), solve(prices,i+1,0,dp));
        }
        return dp[i][buy];

    }
}