class RotateImage {
    public void rotate(int[][] matrix) {
        
            int i,j;
            int n= matrix.length;
       //     int cols=matrix[0].length;
          

            for(i=0;i<n;i++)
            {
                    for( j =i;j<n;j++)
                    {
                            int temp=0;
                            temp=matrix[i][j];
                            matrix[i][j]= matrix[j][i];
                            matrix[j][i]=temp;
                    }
          }
    
        for(i=0;i<n;i++)
        {
            for(j=0;j<n/2;j++)
            {
                int temp=0;
                temp = matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }


    }
}