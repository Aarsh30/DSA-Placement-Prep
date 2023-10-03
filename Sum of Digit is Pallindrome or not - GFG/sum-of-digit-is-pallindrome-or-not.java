//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    int sum(int n)
    {
        int sum=0;
        while(n!=0)
        {
        sum += n % 10;
        n = n /10;
        }
        return sum;
    }
    
    int rev(int m)
    {
        int rev = 0;
        while(m!=0)
        {
            int d = m % 10;
            rev = (rev * 10) + d;
            m=m / 10;
        }
        return rev;
        
    }
    int isDigitSumPalindrome(int N) {
        // code here
        
        int temp = sum(N);
        int rev = rev(temp);
        
        if(rev==temp)
            return 1;
        else
            return 0;
        
    }
}