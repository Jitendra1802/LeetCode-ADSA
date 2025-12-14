class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n= text2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<n+1;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
    public int longestCommonRec(String t1, String t2, int i,int j, int[][] dp){
        if(i<0 || j<0){
            return 0;
        }

        if(t1.charAt(i)==t2.charAt(j)){
             dp[i][j]=1 + longestCommonRec(t1,t2,i-1,j-1,dp);
        }
        else{
            dp[i][j]=Math.max(longestCommonRec(t1,t2,i-1,j,dp),longestCommonRec(t1,t2,i,j-1,dp));
        }
        return dp[i][j];

    }
}