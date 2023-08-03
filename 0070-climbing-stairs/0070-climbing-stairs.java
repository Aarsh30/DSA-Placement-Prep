class Solution {
    public int climbStairs(int n) {
    //     int dp[] = new int[n+1];
    //     Arrays.fill(dp,-1);
    //     return fun(n,dp);
    // }
    // public int fun(int n, int dp[])
    // {
    //     if(n==0)return 1;
    //     if(n==1) return 1;
    //     if(dp[n]!=-1) return dp[n];
    //     return dp[n] =fun(n-1,dp)+fun(n-2,dp);
        
        int dp[] = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}