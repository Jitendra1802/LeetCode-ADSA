class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long sucs) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            int index=getMinPotions(spells[i],potions, sucs);
            ans[i]=potions.length-index;

        }
        return ans;
    }
    public int getMinPotions(int spells, int[] potions, long sucs){
        int left=0;
        int right=potions.length-1 ;
        while(left<=right){
            int mid=left+(right-left)/2;
            if((long)potions[mid]*spells>=sucs){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }  
        return left;
    }
}