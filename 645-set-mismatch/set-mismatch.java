class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        
        //array sum
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        
        // duplicate
        int duplicate = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    duplicate = nums[i];
                    break;
                }
            }
        }
        
        //Find missing
        int actSum = n * (n + 1) / 2;
        int miss = actSum - (sum - duplicate);
        
        return new int[]{duplicate, miss};
    }
}
