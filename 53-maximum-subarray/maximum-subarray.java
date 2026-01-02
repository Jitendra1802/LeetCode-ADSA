class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int best=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            best=Math.max(best,sum);
            if(sum<0){
                sum=0;
            }
        }
        return best;
    }
}