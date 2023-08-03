//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String str = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.makeEven(str));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String makeEven(String s)
    {
        //code here.
        char ch[]=s.toCharArray();
        int n = s.length();
        int eLi = n-1;
        for(int i=0;i<n;i++)
        {
            if((ch[i]-'0')%2==0)
            {
                eLi=i;
                if(ch[i]<ch[n-1])
                    break;
            }
        }
        char temp =ch[n-1];
        ch[n-1]=ch[eLi];
        ch[eLi]=temp;
        
        String str = String.valueOf(ch);
        return str;
    }
}