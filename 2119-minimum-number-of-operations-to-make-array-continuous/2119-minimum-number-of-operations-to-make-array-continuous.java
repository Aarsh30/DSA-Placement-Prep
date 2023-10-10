class Solution {
    public int minOperations(int[] nums) {
        int maxi=0;
        int cnt =0;
        int n=nums.length-1;
        int l=0;

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
            if(i+1<nums.length && nums[i]==nums[i+1])
            {
                continue;
            }
            nums[l++]=nums[i];
        }

        for(int i=0,j=0;j<l;i++)
        {
            while(j<l && (nums[j]-nums[i])<=n)
            {
                cnt++;
                j++;
            }
            maxi = Math.max(maxi,cnt);
            cnt--;
        }
        return nums.length-maxi;
    }
}