class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        solve(0,ans,res,nums, nums.length);
        return ans;
    }
    void solve(int idx,List<List<Integer>> ans, List<Integer> res,int[] nums, int n ){
        if(idx==n){
            ans.add(new ArrayList<>(res));
            return;
        }
        res.add(nums[idx]);
        solve(idx+1,ans,res,nums,n);
        res.remove(res.size()-1);
        solve(idx+1,ans,res,nums, n);
    }
}