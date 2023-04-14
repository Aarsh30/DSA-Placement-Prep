class Solution {
    public int longestPalindromeSubseq(String s) {
       int n= s.length();
       int dp[] = new int[n];

       for(int i = n-1;i>=0;i--)
       {
            int newdp[] = new int[n];
            newdp[i]=1;

            for(int j=i+1;j<n;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    newdp[j]= 2+ dp[j-1];

                }else
                {
                    newdp[j]=Math.max(dp[j],newdp[j-1]);
                }
            }
            dp=newdp;
       }

        return dp[n-1];
        
    }
}