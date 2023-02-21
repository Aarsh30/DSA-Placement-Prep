class  SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList();

        int i,j;
        int row=matrix.length;
        int col = matrix[0].length;

        if(row==0) return list;


        int t = 0, l = 0, r = col-1, b = row-1;
        int d=0;
        while(l<=r && t<=b)
        {
                if(d==0)
                {
                    for(i=l;i<=r;i++)
                   { list.add(matrix[t][i]);}
                    d=1;
                    t++;
                   

                }else if(d==1)
                {
                        for(i=t;i<=b;i++)
                        { list.add(matrix[i][r]);}
                         r--;
                         d=2;
                }
                else if(d==2)
                {
                    for(i=r;i>=l;i--)
                    { list.add(matrix[b][i]);}
                     b--;
                        d=3;
                } else if(d==3)
                {
                    for(i=b;i>=t;i--)
                    { list.add(matrix[i][l]);}
                        d=0;l++;
                }

        }
        return list;

    }
}