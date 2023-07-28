class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int count=1;
        int tcount=2;
        
        for(int i=1;i<=n;i++)
        {
            sum+=count;
            count++;
            
            if(i%7==0)
            {
                count = tcount;
                tcount++;
            }    
        }
        
        return sum;
    }
}