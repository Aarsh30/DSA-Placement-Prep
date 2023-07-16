class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<1<<nums.length;++i)
        {
            List<Integer> subset = new ArrayList<>();
            for(int b=0;b<nums.length;++b)
            {
                if(((i>>b)&1)==1)
                {
                    subset.add(nums[b]);
                }
            }
            res.add(subset);
        }
        return res;
    }
}