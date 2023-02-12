class SearchTargetMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i,j;
        int count=0;
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[0].length;j++)
            {
                    if(matrix[i][j]==target)
                    count=1;

            }
        }
        if(count==1)
          return true;
        else 
            return false;
    }
}