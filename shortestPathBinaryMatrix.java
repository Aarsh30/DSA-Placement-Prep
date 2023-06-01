//upvote if you like
class Solution {
    public class path{
        int x;
        int y;
        int steps;
        public path(int x,int y, int steps){
            this.x=x;
            this.y=y;
            this.steps=steps;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1)
            return -1;
        
        int moves[][]={{0,-1},{0,1},{1,0},{-1,0},{-1,-1},{1,-1},{-1,1},{1,1}};
        
        Queue<path> q=new LinkedList<>();
        q.add(new path(0,0,1));
        while(!q.isEmpty()){
            path temp=q.poll();
            int x=temp.x;
            int y=temp.y;
            if(x==n-1 && y==n-1)
                return temp.steps;
            grid[x][y]=1;
            for(int i=0;i<8;i++){
                int new_x=x+moves[i][0];
                int new_y=y+moves[i][1];
                if(new_x>=0 && new_x<n && new_y>=0 && new_y<n && grid[new_x][new_y]==0){
                    q.add(new path(new_x,new_y,temp.steps+1));
                    grid[new_x][new_y]=1;
                }
            }
        }
        return -1;
        
    }
    
}