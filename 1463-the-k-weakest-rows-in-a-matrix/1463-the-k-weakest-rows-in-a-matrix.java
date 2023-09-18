class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Pair<Integer,Integer>>list = new ArrayList<>();

        for(int i=0;i<mat.length;i++)
        {
            int cnt=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    cnt++;
                }
            }
            list.add(new Pair<>(cnt,i));
        }
        Collections.sort(list,(a,b)->a.getKey()-b.getKey());
        int res[] = new int[k];

        for(int i=0;i<k;i++)
        {
            res[i]= list.get(i).getValue();
        }
        return res;
    }
}