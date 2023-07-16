class Solution {
    
    public void dfs(int s, int[][]isConnected,boolean[] visit)
    {
        visit[s]= true;
        for(int i=0;i<isConnected.length;i++)
        {
            if(isConnected[s][i]==1 && !visit[i])
            {
                dfs(i,isConnected,visit);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count =0;
        boolean[] visit = new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!visit[i])
            {
             count++;
                dfs(i,isConnected,visit);
            }
        }
        return count;
    }
}