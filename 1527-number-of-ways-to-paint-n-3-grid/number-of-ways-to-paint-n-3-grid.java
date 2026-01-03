class Solution {
    public int numOfWays(int n) {
        final int mod=1000000000+7;
        long a=6,b=6;
        for(int i=2;i<=n;i++){
            long newa=(2*a+2*b)%mod;
            long newb=(2*a+3*b)%mod;
            a=newa;
            b=newb;
        }
        return (int)((a+b)%mod);
    }
}