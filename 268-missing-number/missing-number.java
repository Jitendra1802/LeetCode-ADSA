class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int actualSum = n*(n+1)/2;   

        int currentSum = 0;
        for(int i =0; i<nums.length; i++){
            currentSum = currentSum + nums[i];
        }

        int ans = actualSum - currentSum ;

        return ans;

    }
}