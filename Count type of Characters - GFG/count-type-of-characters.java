//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
     
        int n = s.length();
        char ch[] = s.toCharArray();
        int uc=0,lc=0,nc=0,sc=0;
        for(int i=0;i<n;i++)
        {
            if(Character.isUpperCase(ch[i]))
              {
                  uc++;
              }
            else
                if(Character.isLowerCase(ch[i]))
                {
                    lc++;
                }
            else if(Character.isDigit(ch[i]))
            {
                nc++;
            }
            else
            {
                sc++;
            }
        }
         int ans[]= new int[4];
            ans[0]=uc;
            ans[1]=lc;
            ans[2]=nc;
            ans[3]=sc;
            
        return ans;
    }
}