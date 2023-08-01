//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        int flag =1;
            int start =0;
            int end = S.length()-1;
            while(start<=end)
            {
                if(S.charAt(start)!=S.charAt(end))
                   {
                    flag = 0;
                   }
                  start++;
                  end--;
                    
            }
            return flag;
    }
}