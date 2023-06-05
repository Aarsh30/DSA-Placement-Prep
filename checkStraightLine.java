class Solution {
        int getydiff(int[]a, int[]b)
        {
            return a[1]-b[1];
        }

        int getxdiff(int[]a, int[]b)
        {
            return a[0]-b[0];
        }


    public boolean checkStraightLine(int[][] coordinates) {
        int deltay = getydiff(coordinates[1],coordinates[0]);
        int deltax = getxdiff(coordinates[1],coordinates[0]);

        for(int i =2;i<coordinates.length;i++)
        {
            if(deltay*getxdiff(coordinates[i],coordinates[0])!=deltax*getydiff(coordinates[i],coordinates[0]))
            {
                return false;
            }
        }
        return true;
    }
}