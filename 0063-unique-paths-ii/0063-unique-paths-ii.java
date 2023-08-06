class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][]= new int[m][n];
        for(int rows[]:dp)
        {
            Arrays.fill(rows,-1);
            
        }
        return count(m-1,n-1,obstacleGrid,dp);
    }
    
    public static int count(int i, int j,int arr[][], int dp[][])
    {
        if(i>=0 && j>=0 && arr[i][j]==1)
        { return 0;
        }
         if(i==0 && j==0)
         {
             return 1;
         }
          if(i<0 || j<0)
          {
              return 0;
          }
        if(dp[i][j]!=-1)
            return dp[i][j];
        int up = count(i-1,j,arr,dp);
        int left = count(i,j-1,arr,dp);
        
        
        return dp[i][j]= left+up;
    }
}