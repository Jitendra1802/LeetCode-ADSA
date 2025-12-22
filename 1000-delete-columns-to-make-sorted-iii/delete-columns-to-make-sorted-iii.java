class Solution {
    public int minDeletionSize(String[] strs) {
        Integer[] dp= new Integer[strs[0].length()+1];
        int x=print(strs,0,-1,strs.length,dp);
        return strs[0].length()-x ;
    }
    public int print(String[] a, int i, int j,int n,Integer[] dp){
        if(i==a[0].length()){
            return 0;
        } 
        if(dp[j+1]!=null){
            return dp[j+1];
        } 
        int b=0;
        if(j==-1 || compare(a,j,i,n)){
            b=1+print(a,i+1,i,n,dp);
        }
        int c=print(a,i+1,j,n,dp);
        return dp[j+1]= Math.max(b,c);
    }
    public boolean compare(String[] a, int k, int j,int n){
        for(int i=0;i<n;i++){
            if(a[i].charAt(k)>a[i].charAt(j)){
                return false;
            }
        }
        return true;
    }
}