//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            
            long n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            long answer[] = obj.findElements( a, n);
            long sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
            output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
   public long[] findElements(long a[], long n) {
    Arrays.sort(a);
    int k = (int) (n - 2); // Convert n-2 to int
    long ans[] = new long[k];
    int j = 0;
    for (int i = 0; i < k; i++) {
        ans[j] = a[i];
        j++;
    }
    return ans;
}

}