class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] dirs ={{0,1},{0,-1},{1,0},{-1,0}};
        int r = mat.length;
        int c = mat[0].length;
        int[][]visited = new int[r][c];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(mat[i][j]==0)
                {
                    q.add(new int []{i,j});
                    visited[i][j]=1;
                }
            }
        }
        int step =1;
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int k =0;k<size;k++)
            {
                int[] temp = q.poll();
                for(int[] dir :dirs)
                {
                    int x = temp[0]+dir[0];
                    int y = temp[1]+dir[1];
                    
                    if(x>=0 && x<r && y>=0 && y<c && visited[x][y]==0)
                    {
                        visited[x][y]=1;
                        mat[x][y]=step;
                        q.add(new int[]{x,y});
                    }
                }
            }
            step++;
        }
        return mat;
    }
}