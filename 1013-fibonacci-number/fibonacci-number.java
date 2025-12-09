class Solution {

    public int fib(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fibRec(n,dp);

    }
     public int fibo(int n) {
        //c++;
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);

    }
    public int fibRec(int n, int[] dp){
         
         if(n<=1) return n;
         if(dp[n]!=-1) return dp[n];
         return dp[n]=fibRec(n-1,dp)+fibRec(n-2,dp);
    }
}