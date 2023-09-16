class Solution {
    static int minPathSum(int i, int j,List<List<Integer>> triangle, int n, int dp[][] )
    {
        if(dp[i][j]!=-1) return dp[i][j];
        
        if(i==n-1) return triangle.get(i).get(j);
        int down = triangle.get(i).get(j)+minPathSum(i+1,j,triangle,n,dp);
        int diag = triangle.get(i).get(j)+minPathSum(i+1,j+1,triangle,n,dp);
        return dp[i][j]=Math.min(down,diag);
     
        
        
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int dp[][] = new int[n][n];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
            
        }
        return minPathSum(0,0,triangle,n,dp);
    }
}