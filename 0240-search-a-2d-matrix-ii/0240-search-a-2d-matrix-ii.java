class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j = matrix[0].length-1;
       while(i < matrix.length && j >= 0) {
        
            if(matrix[i][j]==target)
                return true;
            if(target > matrix[i][j]) 
            {
                i++;
            }
            else
            {
                j--;
            }
            
        }
        
            
        
        return false;
//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 if(matrix[i][j]==target)
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
    }
}