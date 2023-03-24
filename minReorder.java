class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> el = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            el.add(new ArrayList<Integer>());
        }
        for(int [] c:connections)
        {
            el.get(c[0]).add(c[1]);
             el.get(c[1]).add(-c[0]);
        }

       return doDFS(el,new boolean[n],0);
    }

    static int doDFS(List<List<Integer>>el, boolean[] visited,int root)
    {
        int count=0;
        visited[root] = true;
        for(int to:el.get(root))
        {
            if(!visited[Math.abs(to)])
            {
                    count+=doDFS(el,visited,Math.abs(to)) + ((to>0) ? 1: 0);

            }
        }

        return count;
    }

}