class LongestCycleinaGraph {

    int ans=-1;

    public void dfs(int node,int[]edges,Map<Integer,Integer> dist, boolean[] visited)
    {
        visited[node]=true;
        int neighbour =edges[node];
        if(neighbour!= -1 && !visited[neighbour])
        {
            dist.put(neighbour, dist.get(node)+1);
            dfs(neighbour,edges,dist,visited);
        }else if(neighbour!=-1 && dist.containsKey(neighbour))
        {
            ans = Math.max(ans,dist.get(node)-dist.get(neighbour)+1);
        }
    }
    public int longestCycle(int[] edges) {
        int n = edges.length;
        boolean [] visited = new boolean[n];

        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                Map<Integer,Integer> dist = new HashMap<>();
                dist.put(i,1);
                dfs(i,edges,dist,visited);
            }
        }
        return ans;
    }
}