class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // int i,j;
        // int count=0;
        // for(i=0;i<matrix.length;i++)
        // {
        //     for(j=0;j<matrix[0].length;j++)
        //     {
        //             if(matrix[i][j]==target)
        //             count=1;

        //     }
        // }
        // if(count==1)
        //   return true;
        // else 
        //     return false;



      if (matrix.length == 0)
      return false;

    final int m = matrix.length;
    final int n = matrix[0].length;
    int l = 0;
    int r = m * n;

    while (l < r) {
      final int mid = (l + r) / 2;
      final int i = mid / n;
      final int j = mid % n;
      if (matrix[i][j] == target)
        return true;
      if (matrix[i][j] < target)
        l = mid + 1;
      else
        r = mid;
    }

    return false;
    }

}