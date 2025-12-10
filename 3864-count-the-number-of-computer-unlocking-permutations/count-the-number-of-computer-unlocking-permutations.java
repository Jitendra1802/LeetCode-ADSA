class Solution {
    public int countPermutations(int[] complexity) {
        long mod=1000000000+7;
        long ans=1;
        for(int i=1;i<complexity.length;i++){
            if(complexity[i]<=complexity[0]) return 0;
            ans=(ans*i)%mod;
        }
        return (int)ans;
    }
}