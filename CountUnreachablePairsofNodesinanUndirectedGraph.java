class CountUnreachablePairsofNodesinanUndirectedGraph {

    private List<Integer>[] graph;
    public long countPairs(int n, int[][] edges) {
        createGraph(n,edges);
        boolean[] visited = new boolean[n];
        int numVNodes=0;
        long pairNode =0;
        for(int node=0;node<n;++node)
        {
            if(!visited[node])
            {
                int numNode = dFS(node,visited);
                pairNode +=(long) numNode*numVNodes;
                numVNodes+=numNode;
            }
        }
        return pairNode;
    }
    private int dFS(int node,boolean[] visited)
    {
        visited[node]=true;
        int numConnectNode=1;
        for(int neighbor:graph[node])
        {
            if(!visited[neighbor])
                {
                    numConnectNode += dFS(neighbor,visited);
                }
            }
            return numConnectNode;
    }


    private void createGraph(int n,int [][]edges)
    {
        graph = new List[n];
        for(int node =0; node<n;++node)
        {
            graph[node]= new ArrayList<>();
        }
        for(int i=0;i<edges.length;++i)
        {
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }
    }
}