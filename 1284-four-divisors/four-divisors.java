class Solution {
    public int sumFourDivisors(int[] nums) {
        int total= 0;
        for(int x : nums){
            int count=0;
            int sum=0;

            for(int div=1;div<=x;div++){
                if(x%div==0){
                    count++;
                    sum +=div;
                }
                if(count>4){
                    break;
                }
            }
            if(count==4){
                total +=sum;
            }
        }
        return total;
    }
}