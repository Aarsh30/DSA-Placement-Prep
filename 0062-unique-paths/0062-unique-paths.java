class Solution {
    
    public int uniquePathsCount(int m, int n, int [][]dp)
    {
        for(int  i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0)
                {
                    dp[i][j]=1;
                    continue;
                    
                }
                int up=0,left =0;
                if(i>0)
                    up = dp[i-1][j];
                if(j>0)
                    left = dp[i][j-1];
                
               dp[i][j]= up +left;
            }
        }
        return dp[m-1][n-1];
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
            for(int[]rows :dp)
            {
                Arrays.fill(rows,-1);                
            }
        return uniquePathsCount(m,n,dp);
    }
}