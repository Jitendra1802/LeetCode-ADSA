class Solution {
    public String longestPalindrome(String s) {
        int n= s.length();

        int maxLen=1;
        int sp=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s, i, j)==true){
                    if(j-i+1>maxLen){
                        maxLen=j-i+1;
                        sp=i;
                    }
                }
            }
        }
        return s.substring(sp,sp+maxLen);
    }
    private boolean isPalindrome(String s, int i , int j){
        if(i>=j){
            return true;
        }

        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return isPalindrome(s,i+1,j-1);
    }
}