//Sum of all divisors from 1 to n


//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class PrintDivisor
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long sumOfDivisors(int N){
        // code here
           long sum=0;
           long div;
            for(int i=1;i<=N;i++)
           {
            div =N/i;
            sum=sum+div*i;
            }
       
                  
                return sum;


    }
}