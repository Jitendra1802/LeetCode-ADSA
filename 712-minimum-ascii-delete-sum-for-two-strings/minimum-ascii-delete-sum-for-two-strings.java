class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int sum1=0,sum2=0;
        for(char ch:s1.toCharArray()){
            int x=(int)ch;
            sum1+=x;
        }
        for(char ch:s2.toCharArray()){
            int x=(int)ch;
            sum2+=x;
        }
        Integer[][] dp= new Integer[s1.length()][s2.length()];
        return mini(s1,s2,s1.length()-1,s2.length()-1,sum1,sum2,dp);
    }
    public int mini(String s1,String s2, int i, int j, int sum1, int sum2,Integer[][] dp){
        
        if(i<0 && j<0) return 0;
        if(i<0) return sum2;
        if(j<0) return sum1;
        if(dp[i][j]!=null) return dp[i][j];
        int a= (int) s1.charAt(i), b=(int) s2.charAt(j);
        if(s1.charAt(i)==s2.charAt(j))
           return mini(s1,s2,i-1,j-1,sum1-a,sum2-b,dp);
        int del1=a+mini(s1,s2,i-1,j,sum1-a,sum2,dp);
        int del2=b+mini(s1,s2,i,j-1,sum1,sum2-b,dp);
        return dp[i][j]=Math.min(del1,del2);
    }
}