//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();

            Solution ob = new Solution();
            String ans = ob.getBinaryRep(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String getBinaryRep(int N){
        // code here
        String bin = Integer.toBinaryString(N);
        int len = 30-bin.length();
        
      
        StringBuilder st = new StringBuilder();
        for(int i=0;i<len;i++)
        {
            st.append("0");
        }
        return new String(st)+bin;
    }
}