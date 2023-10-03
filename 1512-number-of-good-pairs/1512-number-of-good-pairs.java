class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(i<j && nums[i]==nums[j])
                {
                    ans++;
                }
                }
        }
        return ans;
    }
}