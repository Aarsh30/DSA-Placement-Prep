class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int dp[][] = new int [n+1][m+1];

        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0)
                {
                    dp[i][j]=j;
                }
                else if(j==0)
                {
                    dp[i][j]=i;
                
                }
                else if(word1.charAt(i-1)==word2.charAt(j-1))
                {
                    dp[i][j]= dp[i-1][j-1];

                }
                else
                {
                    dp[i][j]= 1+ Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
                }
            }
        }
        int ans = dp[n][m];

        return ans;
    }
}