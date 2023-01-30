//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class CountDigit
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
        
     
        int temp =N, count=0;
        
        while(temp!=0)
        {
          int d= temp %10;
          temp =temp/10;
            
            if(d>0 && N%d==0)
                count++;

        }
        
        return count;
    }
}