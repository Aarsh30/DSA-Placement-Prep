//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumPalindrome(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    
    static long reverseNum(long n)
    {
        long rev =0;
        while(n!=0)
        {
            long d = n%10;
            rev =rev *10 +d;
            n=n/10;
        }
        return rev;
    }
    
    static boolean isPalindrome(long n)
    {
      
        if(n== reverseNum(n))
            return true;
        else
            return false;
    }
    static long isSumPalindrome(long n){
        // code here
        long num = n;
        for(int i=0;i<=5;i++)
        {
            if(isPalindrome(num))
                return num;
            
            else
                num+=reverseNum(num);
        }
        return -1;
        
    }
}