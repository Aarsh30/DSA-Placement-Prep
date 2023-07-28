class Solution {
//     public int totalMoney(int n) {
//         int sum=0;
//         int count=1;
//         int tcount=2;
        
//         for(int i=1;i<=n;i++)
//         {
//             sum+=count;
//             count++;
            
//             if(i%7==0)
//             {
//                 count = tcount;
//                 tcount++;
//             }    
//         }
        
//         return sum;
//     }
    
    public int totalMoney(int n)
    {
        int m = n/7;
         int sum=0;
        for(int i=1;i<=m;i++)
        {
            sum +=7*(i+3); 
        }
        
        for(int i=7*m;i<n;i++)
        {
            sum += ++m;
        }
        
        return sum;
    }
}