class RearrangeArraySign {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length,p = 0,ni=1;
        int ans [] = new int[n];
    
        for(int i=0;i<n;i++)
        {
                if(nums[i]>0)
                {
                ans[p]= nums[i];
                p+=2;
                
                }
                else if(nums[i]<0)
                {
                ans[ni]= nums[i];
                ni+=2;
                         
                }
                


        }

        return ans;

    }
}