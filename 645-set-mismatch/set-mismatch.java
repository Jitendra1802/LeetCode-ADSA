class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1]; 
        for (int x : nums) {
            freq[x]++;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) ans.add(i);  
        }
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) ans.add(i); 
        }

        return new int[]{ ans.get(0), ans.get(1) };
    }
}
