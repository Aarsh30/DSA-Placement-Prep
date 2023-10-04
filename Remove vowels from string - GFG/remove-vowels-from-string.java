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
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeVowels(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeVowels(String S) {
        // code here
        
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='a' || S.charAt(i)=='e' || S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u')
            {
                continue;
            }
            else
            ans.append(S.charAt(i));
        }
        return ans.toString();
    }
}