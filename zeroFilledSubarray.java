class Solution {
    public long zeroFilledSubarray(int[] nums) {
    
   long ans=0, nZero=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==0)
                {
                        nZero++;
                }else
                {
                    nZero=0;
                }
                ans+=nZero;
            }
        return ans;
    }
}