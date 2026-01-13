class Solution {
    public int missingNumber(int[] nums) {
        // Using XOR

        int n1=0;
        int n2=0;
        for(int i=0;i<nums.length;i++){
            n1=n1^nums[i];
        }
        for(int i=1;i<=nums.length;i++){
            n2=n2^i;
        }
        return n1^n2;
    }
}