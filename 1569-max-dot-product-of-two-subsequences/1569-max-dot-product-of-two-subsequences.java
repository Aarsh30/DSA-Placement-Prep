class Solution {
    int memo[][];

    public int dp(int i, int j, int nums1[], int nums2[])
    {
        if(i==nums1.length||j==nums2.length)
        {
            return 0;
        }
        if(memo[i][j]!=0)
        {
            return memo[i][j];
        }
        int use = nums1[i]*nums2[j]+dp(i+1,j+1,nums1,nums2);
        memo[i][j]=Math.max(use,Math.max(dp(i+1,j,nums1,nums2),dp(i,j+1,nums1,nums2)));
        return memo[i][j];


    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int firstmin = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;

        for(int num : nums1)
        {
            firstmax = Math.max(firstmax,num);
            firstmin = Math.min(firstmin,num);
        }

        for(int num:nums2)
        {
            secondmax = Math.max(secondmax,num);
            secondmin = Math.min(secondmin,num);
        }

        if(firstmax<0 && secondmin>0)
        {
            return firstmax*secondmin;
        }
        if(firstmin>0 && secondmax<0)
        {
            return firstmin*secondmax;
        }

        memo = new int[nums1.length][nums2.length];
        return dp(0,0,nums1,nums2);
    }
}