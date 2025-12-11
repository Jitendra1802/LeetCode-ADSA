class Solution {
    boolean[][] memo;
    public String longestPalindrome(String s) {
        int n= s.length();
        
        memo= new boolean[n][n];
        boolean[][] visited=new boolean[n][n];

        int maxLen=1;
        int sp=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s, i, j, visited)){
                    if(j-i+1>maxLen){
                        maxLen=j-i+1;
                        sp=i;
                    }
                }
            }
        }
        return s.substring(sp,sp+maxLen);
    }
    private boolean isPalindrome(String s, int i , int j, boolean[][]  visited){
        if(i>=j){
            return true;
        }
        if(visited[i][j]){
            return memo[i][j];
        }
        visited[i][j]=true;

        if(s.charAt(i)!=s.charAt(j)){
            memo[i][j]=false;
            return false;
        }
        memo[i][j]=isPalindrome(s,i+1,j-1, visited);
        return memo[i][j];
    }
}