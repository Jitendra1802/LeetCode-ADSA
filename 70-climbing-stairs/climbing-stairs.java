class Solution {
    public int climbStairs(int n) {
        int[] dp= new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=-1;
        }
        return solve(n,0,dp);
    }
    public int solve(int n, int i, int[] dp){
        if(i>n){
            return 0;
        }
        if(n<=3){
            return n;
           
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        if(i==n){
            return 1;
        }

        return dp[i]= solve(n,i+1,dp)+solve(n,i+2,dp);
    }
}